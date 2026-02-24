package org.pokemon_battlefield.Model;

import org.pokemon_battlefield.utils.ClassesTreinadores;

import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public record Treinador (
        String name,
        int id,
        int bonusAtq,
        int bonusDef,
        ClassesTreinadores classe
        ) {
        @Override
        public String toString() {
                return String.format("%s\nBônus de ataque: %d Bônus de defesa: %d Classe: %s\n", name, bonusAtq, bonusDef, this.classe.getName());
        }

        @Override
        public boolean equals(Object o) {
                if (!(o instanceof Treinador treinador)) return false;
            return Objects.equals(name, treinador.name);
        }

        @Override
        public int hashCode() {
                return Objects.hashCode(name);
        }
}
