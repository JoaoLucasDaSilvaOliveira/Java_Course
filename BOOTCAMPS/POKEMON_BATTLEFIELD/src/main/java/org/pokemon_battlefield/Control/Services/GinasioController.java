package org.pokemon_battlefield.Control.Services;

import org.pokemon_battlefield.Control.PrincipalController;
import org.pokemon_battlefield.View.SubMenusView;

public class GinasioController {
    private final SubMenusView subMenusView;

    public GinasioController(PrincipalController principalController) {
        this.subMenusView = new SubMenusView(principalController);
    }
}
