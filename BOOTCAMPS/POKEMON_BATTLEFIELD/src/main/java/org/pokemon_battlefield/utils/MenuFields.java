package org.pokemon_battlefield.utils;

public enum MenuFields {
    MENU("""
                SEJA MUITO BEM VINDO AO POKEMON BATTLEFIELD!
                 ---------------MENU----------------
                |              CAMPOS               |
                |0. Sair                            |
                |1. Treinadores                     |
                |2. Pokemons                        |
                |3. Ginasios                        |
                |4. Batalhas                        |
                 -----------------------------------
               Opção: \s"""),
    TREINADOR("""
                 ----------------MENU-----------------
                |            TREINADORES              |
                | 0. Sair                             |
                | 1. Listar                           |
                | 2. Cadastrar                        |
                | 3. Atualizar                        |
                | 4. Excluir                          |
                 -------------------------------------
                Opção: \s"""),
    POKEMON("""
             ----------------MENU-----------------
            |              POKEMONS               |;
            | 0. Sair                             |;
            | 1. Listar                           |;
            | 2. Cadastrar                        |;
            | 3. Pesquisa pelo nome               |;
            | 4. Excluir                          |;
             -------------------------------------
            Opção: \s"""),
    GINASIO("""
             ----------------MENU-----------------
            |              GINASIOS               |
            | 0. Sair                             |
            | 1. Listar                           |
            | 2. Cadastrar                        |
            | 3. Pesquisar                        |
            | 4. Excluir                          |
             -------------------------------------
            Opção: \s"""),
    BATALHA("""
             ----------------MENU-----------------
            |              BATALHA!               |;
            | 0. Sair                             |;
            | 1. Listar                           |;
            | 2. Listar batalhas do treinador     |;
            | 3. Listar batalhas no ginasio       |;
            | 4. Realizar uma batalha!            |;
            | 5. Procurar score do treinador      |;
             -------------------------------------
            Opção: \s""");

    private final String text;

    private MenuFields (String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
