package org.pokemon_battlefield.utils;

import java.util.Optional;

public class ValidFormats {

    public static Optional<Integer> validateEntryMenu (String entry, int begin, int end){
        //valida se a entrada é um número
        try {
            int resp = Integer.parseInt(entry);
            if (resp >= begin && resp <=end){
                return Optional.of(resp);
            } else {
                return Optional.empty();
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer validateNumber (String entry){
        //valida se a entrada é um número
        try {
            return Integer.parseInt(entry);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public static String validateName (String entry){
        if (entry != null && !entry.matches("\\d+")){
            return entry;
        }
        throw new IllegalArgumentException("Nome inválido!");
    }
}
