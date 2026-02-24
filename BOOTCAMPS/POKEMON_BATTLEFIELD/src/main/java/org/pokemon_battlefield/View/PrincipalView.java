package org.pokemon_battlefield.View;

import org.pokemon_battlefield.Control.PrincipalController;
import org.pokemon_battlefield.utils.MenuFields;
import org.pokemon_battlefield.utils.SystemCls;
import org.pokemon_battlefield.utils.ValidFormats;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrincipalView {

    private final PrincipalController principalController;

    public PrincipalView(PrincipalController principalController) {
        this.principalController = principalController;
    }

    public void mainView(Scanner in, MenuFields field){
        while (true){
            System.out.print(field.getText());
            try{
                int resp = ValidFormats.validateEntryMenu(in.nextLine(), 0, 4).orElseThrow();
                switch (field){
                    case MENU -> principalController.chamadaMenu(resp);
                    case TREINADOR -> principalController.chamadaTreinador(resp);
                    /*case POKEMON -> principalController.chamadaPokemon(resp);
                    case GINASIO -> principalController.chamadaGinasio(resp);
                    case BATALHA -> principalController.chamadaBatalha(resp);*/
                }
            } catch (NoSuchElementException e ){
                System.out.println("Valor fora das opções");
                SystemCls.cls();
            } catch (RuntimeException e) {
                System.out.println("O valor digitado precisa ser um número!");
                SystemCls.cls();
            }
        }
    }

}
