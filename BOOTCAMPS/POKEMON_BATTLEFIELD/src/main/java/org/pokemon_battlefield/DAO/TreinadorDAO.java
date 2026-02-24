package org.pokemon_battlefield.DAO;

import org.pokemon_battlefield.Model.Treinador;
import org.pokemon_battlefield.utils.*;
import java.sql.*;
import java.util.*;

//TODO: criar o package e classes para manipulação de i/o para não precisar printar nada aqui!
public final class TreinadorDAO implements OperationsDAO<Treinador>{

    public static final String TABLE_NAME = "TREINADORES";
    public static final List<String> COLUMN_NAMES = List.of("nome", "bonusAtq", "bonusDef", "classe");

    public void create(String name, int bonusAtq, int bonusDef, ClassesTreinadores classe){
        var optTreinadores = listAll();
        if (optTreinadores.isPresent()) {
            //CASO JÁ HAJA TREINADORES CADASTRADOS PRECISAMOS CONFERIR SE JÁ HÁ UM TREINADOR COM O MESMO NOME!
            //AQUI PERCORREMOS A LISTA PROCURANDO SE HÁ UM TREINADOR COM O MESMO NOME
            if (optTreinadores.get().stream().anyMatch(treinador -> treinador.name().equalsIgnoreCase(name))) {
                //NESSE CASO TEMOS JÁ UM TREINADOR COM ESSE NOME
                System.out.println("Já há um treinador com esse nome cadastrado!");
                return;
            }
        }
        //NESSE CASO PODE OU NÃO TER TREINADORES JÁ CADASTRADOS, MAS CASO TENHAM, NÃO ESTAMOS A INSERIR EM DUPLICIDADE!
        try (PreparedStatement preparedStatement = getPreparedStatement(QueryBuilder.insert(TABLE_NAME, COLUMN_NAMES))) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, bonusAtq);
            preparedStatement.setInt(3, bonusDef);
            preparedStatement.setString(4, classe.getName().toUpperCase());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0){
                System.out.println("Treinador cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao gravar treinador!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /***
     *
     * @return Optional vazio caso não tenha treinadores cadastrados ou um Optional com uma lista de treinadores dentro.
     */
    @Override
    public Optional<List<Treinador>> listAll() {
        List<Treinador> treinadorList= new ArrayList<>();
        //CONECTANDO COM O BANCO
        try (
                PreparedStatement preparedStatement = getPreparedStatement(QueryBuilder.listAll(TABLE_NAME))
        ){
            try (ResultSet response = preparedStatement.executeQuery()){
                while (response.next()){
                    Treinador temp = createInstance(response, (bdReponse) -> new Treinador(
                            bdReponse.getString("nome"),
                            bdReponse.getInt("id"),
                            bdReponse.getInt("bonusAtq"),
                            bdReponse.getInt("bonusDef"),
                            ClassesTreinadores.valueOf(bdReponse.getString("classe"))
                    ));
                    treinadorList.add(temp);
                } if (treinadorList.isEmpty()) {
                    return Optional.empty();
                } else {
                    return Optional.of(treinadorList);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Treinador> searchByName(String name){
        var allTreinadores = listAll();
        if (allTreinadores.isPresent()){
            List<Treinador> treinadorList = allTreinadores.get();
            for (Treinador t : treinadorList){
                if (t.name().equals(name)){
                    return Optional.of(t);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Treinador> searchById(int id) {
        var allTreinadores = listAll();
        if (allTreinadores.isPresent()){
            List<Treinador> treinadorList = allTreinadores.get();
            for (Treinador t : treinadorList){
                if (t.id() == id){
                    return Optional.of(t);
                }
            }
        }
        return Optional.empty();
    }

    public void update(String oldName, String newName, ClassesTreinadores classe) {
        //RECEBENDO TREINADOR PELO NOME
        var optTreinador = searchByName(oldName);
        //VERIFICANDO SE HÁ O TREINADOR
        if (optTreinador.isEmpty()){
            System.out.println("Treinador não cadastrado para ser atualizado");
            return;
        }
        //NESSE CASO PRECISAMOS CONFERIR SE HOUVERAM MUDANÇAS NO OBJETO
        Treinador old = optTreinador.get();
        if (old.name().equalsIgnoreCase(oldName) && old.classe().equals(classe)){
            System.out.println("Por favor, mude algo no treinador para atualizá-lo");
            return;
        }
        //NESSE CASO HOUVERAM MUDANÇAS, PRECISAMOS NOS CERTIFICAR QUE NÃO FOI MUDADO PARA UM NOME QUE JÁ TINHA NO BD SE QUE NÃO ERA O NOME DO OBJETO
        if (searchByName(newName).isPresent() && !newName.equals(oldName)){
            System.out.println("Novo nome já está em uso!");
            return;
        }
        //NESSE CASO HOUVERAM MUDANÇAS E O NOVO NOME É ÚNICO
        try (PreparedStatement preparedStatement = getPreparedStatement(QueryBuilder.update(TABLE_NAME, COLUMN_NAMES))) {
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, classe.getAtq());
            preparedStatement.setInt(3, classe.getDef());
            preparedStatement.setString(4, classe.getName().toUpperCase());
            preparedStatement.setInt(5, old.id());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0){
                System.out.println("Treinador atualizado!");
            } else {
                System.out.println("Erro na atualização!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //TODO: VERIFICAR DEPOIS AS RESTRIÇÕES DE INTEGRIDADES DAS OUTRAS ENTIDADES PARA VALIDAR O DELETE!
    @Override
    public void delete(int id) {
        try (PreparedStatement preparedStatement = getPreparedStatement(QueryBuilder.delete(TABLE_NAME))){
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0){
                System.out.println("Usuário deletado com sucesso");
            } else {
                System.out.println("Erro ao deletar!");
            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
