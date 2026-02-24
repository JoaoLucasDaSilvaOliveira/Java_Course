package org.pokemon_battlefield.View;

import org.pokemon_battlefield.Control.PrincipalController;

import java.util.List;
import java.util.Optional;

public class SubMenusView extends PrincipalView{

    public SubMenusView(PrincipalController principalController) {
        super(principalController);
    }

    public <T> void listAll (Optional<List<T>> objToPrint, String name){
        if (objToPrint.isEmpty()){
            System.out.println("Não há " + name + " cadastrados");
        } else {
            var list = objToPrint.get();
            for (int i = 0; i < list.size(); i++){
                System.out.println(i+1+" - "+list.get(i));
            }
        }
    }
}
