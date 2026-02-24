package org.pokemon_battlefield.Control.Services;

import org.pokemon_battlefield.Control.PrincipalController;
import org.pokemon_battlefield.View.SubMenusView;

public class PokemonController {

    private final SubMenusView subMenusView;

    public PokemonController(PrincipalController principalController) {
        this.subMenusView = new SubMenusView(principalController);
    }

    public void listAllPoke(){

    }

    public void createPoke(String name, int codDono, int pv, int pa, int pd){

    }

    public void updatePoke(String oldName, String newName, int newPv, int newPa, int newPd){

    }

    public void deletePoke(int id){

    }
}
