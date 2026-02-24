package org.pokemon_battlefield.Model;

import java.util.List;
import java.util.UUID;

public record Batalha (
        int cod,
        int pokeVencedor,
        List<Integer> codTreinadores,
        List<Integer> codPokemons,
        int codGinasio
        ){}
