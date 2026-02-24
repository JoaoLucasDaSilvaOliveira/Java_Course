package org.pokemon_battlefield.Control;

import org.pokemon_battlefield.Control.Services.BatalhaController;
import org.pokemon_battlefield.Control.Services.GinasioController;
import org.pokemon_battlefield.Control.Services.PokemonController;
import org.pokemon_battlefield.Control.Services.TreinadorController;
import org.pokemon_battlefield.View.PrincipalView;
import org.pokemon_battlefield.View.SubMenusView;
import org.pokemon_battlefield.View.TreinadorView;

import java.util.Scanner;

import static org.pokemon_battlefield.utils.MenuFields.*;


public class PrincipalController {

    private final Scanner scan = new Scanner(System.in);

    private final PrincipalView principalView = new PrincipalView(this);
    //CONTROLLERS
    private final TreinadorController treinadorController = new TreinadorController(this);
    private final PokemonController pokemonController = new PokemonController(this);
    private final GinasioController ginasioController = new GinasioController(this);
    private final BatalhaController batalhaController = new BatalhaController(this);
    //VIEWS
    private final TreinadorView treinadorView = new TreinadorView(this);

    public PrincipalController(){
    }

    public void newGame () {
        principalView.mainView(scan, MENU);
    }

    public void chamadaMenu (int option){
        switch (option){
            case 0:
                System.out.println("Obrigado por jogar!");
                System.exit(0);

            case 1:
                principalView.mainView(this.scan, TREINADOR);
                break;

            case 2:
                principalView.mainView(this.scan, POKEMON);
                break;

            case 3:
                principalView.mainView(this.scan, GINASIO);
                break;

            case 4:
                principalView.mainView(this.scan, BATALHA);
                break;
        }
    }

    public void chamadaTreinador (int option) {
            switch (option){
                case 0:
                    principalView.mainView(scan, MENU);
                    break;

                case 1:
                    treinadorController.listarTreinadores();
                    break;

                case 2:
                    treinadorView.criarTreinador(scan);
                    break;

                case 3:
                    var optListTreinadores = treinadorController.getTreinadores();
                    if (optListTreinadores.isPresent()){
                        treinadorView.atualizarTreinador(scan, optListTreinadores.get());
                    } else {
                        System.out.println("Não há treinadores cadastrados!");
                    }
                    break;

                case 4:
                    var optListTreinador = treinadorController.getTreinadores();
                    if (optListTreinador.isPresent()){
                        treinadorView.deletarTreinador(scan, optListTreinador.get());
                    } else {
                        System.out.println("Não há treinadores cadastrados!");
                    }
            }
    }

    public void chamadaPokemon (int option){
        switch (option){
            case 0:
                principalView.mainView(scan, MENU);
                break;

            case 1:
                pokemonController.listAllPoke();
                break;
        }
    }
    public void chamadaGinasio (int option){
        switch (option){
            case 0:
                principalView.mainView(scan, MENU);
                break;
        }
    }
    public void chamadaBatalha (int option){
        switch (option){
            case 0:
                principalView.mainView(scan, MENU);
                break;
        }
    }
}
