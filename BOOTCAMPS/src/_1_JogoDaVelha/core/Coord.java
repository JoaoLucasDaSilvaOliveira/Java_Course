package _1_JogoDaVelha.core;

import _1_JogoDaVelha.util.ValidationUtils;

import java.util.Objects;

public record Coord (int i, int j) {

    //construtor
    public Coord {
        ValidationUtils.require(i>=0 && i< Board.SIZE, "i is out of range");
        ValidationUtils.require(j>=0 && j< Board.SIZE, "j is out of range");
    }

    public static Coord parse (String text){
        //i,j -> 2,1; 0,0
        Objects.requireNonNull(text);

        String[] tokens = text.split(",");
        if (tokens.length != 2){
            throw new IllegalArgumentException("Invalid format");
        }
        try {
            return new Coord(Integer.parseInt(tokens[0])-1, Integer.parseInt(tokens[1])-1);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number");
        }
    }
}
