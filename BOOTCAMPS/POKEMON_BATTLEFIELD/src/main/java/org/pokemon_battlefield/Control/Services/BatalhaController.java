package org.pokemon_battlefield.Control.Services;

import org.pokemon_battlefield.Control.PrincipalController;
import org.pokemon_battlefield.View.SubMenusView;

public class BatalhaController {
    private final SubMenusView subMenusView;

    public BatalhaController(PrincipalController principalController) {
        this.subMenusView = new SubMenusView(principalController);
    }
}
