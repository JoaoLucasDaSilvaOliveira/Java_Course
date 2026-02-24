package org.pokemon_battlefield.View;

import org.pokemon_battlefield.Control.PrincipalController;
import org.pokemon_battlefield.Control.Services.TreinadorController;
import org.pokemon_battlefield.Model.Treinador;
import org.pokemon_battlefield.utils.ClassesTreinadores;
import org.pokemon_battlefield.utils.ValidFormats;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TreinadorView {

    private final TreinadorController treinadorController;

    public TreinadorView(PrincipalController principalController) {
        this.treinadorController = new TreinadorController(principalController);
    }

    private static final List<ClassesTreinadores> classesTreinadores = new ArrayList<>(List.of(
            ClassesTreinadores.DEFENDER,
            ClassesTreinadores.INTELIGENT,
            ClassesTreinadores.TATIC,
            ClassesTreinadores.BERSEKER
    ));

    public void criarTreinador (Scanner in) {
        String name;
        while (true){
//            SystemCls.cls();
            System.out.print("""
                CRIAR TREINADOR
                
                Por favor, digite o nome do seu treinador:\s""");
            try{
                name = ValidFormats.validateName(in.nextLine());
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
//            SystemCls.cls();
            System.out.println("\nQual classe ele pertence?\n\n");
            printClasses();
            try{
                int op = ValidFormats.validateEntryMenu(in.nextLine(), 1, classesTreinadores.size()).orElseThrow();
                treinadorController.criarTreinador(name, classesTreinadores.get(op-1));
                break;
            } catch (NoSuchElementException e){
                System.out.println("Valor fora das opções");
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void atualizarTreinador (Scanner in, List<Treinador> treinadoresList) {
        String oldName;
        String newName;
        ClassesTreinadores classeTreinador;
        while (true){
            System.out.println("ATUALIZAR TREINADOR\n");
            for (int i = 0; i < treinadoresList.size(); i++){
                System.out.println(i+1 + " - " + treinadoresList.get(i));
            }
            System.out.print("Por favor, digite o número do treinador que deseja atualizar: ");
            try{
                int op = ValidFormats.validateEntryMenu(in.nextLine(), 1, treinadoresList.size()).orElseThrow();
                oldName = treinadoresList.get(op-1).name();
                break;
            } catch (NoSuchElementException e){
                System.out.println("Valor fora das opções");
            }
        }
        while (true){
            System.out.print("\n Ok!\n\nAgora digite o novo nome do treinador: ");
            try {
                newName = ValidFormats.validateName(in.nextLine());
                break;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        while (true){
            System.out.println("\nBeleza! A qual classe ele pertence?\n\n");
            printClasses();
            try{
                int op = ValidFormats.validateEntryMenu(in.nextLine(), 1, classesTreinadores.size()).orElseThrow();
                treinadorController.atualizarTreinador(oldName, newName, classesTreinadores.get(op-1));
                break;
            } catch (NoSuchElementException e){
                System.out.println("Valor fora das opções");
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public void deletarTreinador (Scanner in, List<Treinador> treinadorList){
        System.out.println("EXCLUIR TREINADOR\n");
        while (true){
            for (int i = 0; i < treinadorList.size(); i++){
                System.out.println(i+1 + " - " + treinadorList.get(i));
            }
            System.out.print("Por favor, digite o codigo do treinador que deseja excluir: ");
            try{
                int pos = ValidFormats.validateEntryMenu(in.nextLine(), 1, treinadorList.size()).orElseThrow();
                treinadorController.deletarTreinador(treinadorList.get(pos-1).id());
                break;
            } catch (NoSuchElementException e){
                System.out.println("Valor fora das opções!");
            }
        }
    }

    public void printClasses (){
        IntStream.range(0, classesTreinadores.size())
                .forEach(i -> {
                    var classT = classesTreinadores.get(i);
                    System.out.println(
                            (i + 1) + " - " + classT.getName()
                                    + " | Ataque: " + classT.getAtq()
                                    + " | Defesa: " + classT.getDef()
                    );
                });
    }
}
