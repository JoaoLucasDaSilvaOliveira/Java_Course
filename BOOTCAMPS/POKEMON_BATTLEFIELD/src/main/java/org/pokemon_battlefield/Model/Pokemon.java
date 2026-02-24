package org.pokemon_battlefield.Model;

public record Pokemon (
        String name,
        int id,
        int codOwner,
        String ownerName,
        int health,
        int damage,
        int defense
        ) {
        @Override
        public String toString() {
                return String.format("%s\nDono: %s Vida: %d Dano %d Defesa %d", name, ownerName, health, damage, defense);
        }
}
