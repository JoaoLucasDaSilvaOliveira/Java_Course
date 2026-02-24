package org.pokemon_battlefield;

import org.pokemon_battlefield.Control.PrincipalController;

public class Application {
    public static void main(String[] args) {
        while (true){
            try{
                new PrincipalController().newGame();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
