package org.pokemon_battlefield.Control.Services;

import org.pokemon_battlefield.Control.PrincipalController;
import org.pokemon_battlefield.DAO.TreinadorDAO;
import org.pokemon_battlefield.Model.Treinador;
import org.pokemon_battlefield.View.SubMenusView;
import org.pokemon_battlefield.utils.ClassesTreinadores;

import java.util.List;
import java.util.Optional;

public class TreinadorController {

    private final TreinadorDAO treinadorDAO = new TreinadorDAO();
    private final SubMenusView subMenusView;

    public TreinadorController(PrincipalController principalController) {
        this.subMenusView = new SubMenusView(principalController);
    }

    public void listarTreinadores (){
        subMenusView.listAll(treinadorDAO.listAll(), "treinadores");
    }

    public void criarTreinador (String name, ClassesTreinadores classe) {
        treinadorDAO.create(name, classe.getAtq(), classe.getDef(), classe);
    }

    public Optional<List<Treinador>> getTreinadores (){
        return treinadorDAO.listAll();
    }

    public void atualizarTreinador (String oldName, String newName, ClassesTreinadores classe) {
        treinadorDAO.update(oldName, newName, classe);
    }

    public void deletarTreinador (int id){
        treinadorDAO.delete(id);
    }

}
