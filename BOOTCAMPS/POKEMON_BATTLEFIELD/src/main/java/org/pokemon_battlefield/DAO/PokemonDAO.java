//package org.pokemon_battlefield.DAO;
//
//import org.pokemon_battlefield.Model.Pokemon;
//import org.pokemon_battlefield.utils.ClassesTreinadores;
//import org.pokemon_battlefield.utils.QueryBuilder;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//public final class PokemonDAO implements OperationsDAO <Pokemon>{
//
//    private final static String TABLE_NAME = "POKEMONS";
//
//    //PRECISAMOS DELE PARA RECUPERAR INFORMAÇÕES E COLOCAR NO POKEMON
//    private final TreinadorDAO treinadorDAO = new TreinadorDAO();
//
//    @Override
//    public Optional<List<Pokemon>> listAll() {
//        List<Pokemon> pokemonList= new ArrayList<>();
//        //CONECTANDO COM O BANCO
//        try (
//                PreparedStatement preparedStatement = getPreparedStatement(QueryBuilder.listAll(TABLE_NAME))
//        ){
//            try (ResultSet response = preparedStatement.executeQuery()){
//                while (response.next()){
//                    Pokemon temp = createInstance(response, (bdReponse) -> {
//                        String ownerName = treinadorDAO.searchById(bdReponse.getInt("ownerId")).orElseThrow().name();
//                        return new Pokemon(
//                                bdReponse.getString("nome"),
//                                bdReponse.getInt("id"),
//                                bdReponse.getInt("codDono"),
//                                ownerName,
//                                bdReponse.getInt("vida"),
//                                bdReponse.getInt("dano"),
//                                bdReponse.getInt("defesa")
//                        );
//                    });
//                    pokemonList.add(temp);
//                } if (pokemonList.isEmpty()) {
//                    return Optional.empty();
//                } else {
//                    return Optional.of(pokemonList);
//                }
//            } catch (NoSuchElementException e){
//                System.out.println("Erro recuperando o cod do treinador");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Override
//    public Optional<Pokemon> searchByName(String name) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Pokemon> searchById(int id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void delete(int id) {
//
//    }
//}
