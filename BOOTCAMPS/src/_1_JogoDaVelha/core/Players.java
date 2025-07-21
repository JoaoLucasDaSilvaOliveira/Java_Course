package _1_JogoDaVelha.core;

import java.util.*;

public class Players {
    private final List<Symbol> players = new ArrayList<>(2);
    private int currentPlayerIndex = -1;

    public Players (){
        players.add(Symbol.X);
        players.add(Symbol.O);
    }

    public Symbol next (){
        return players.get((currentPlayerIndex = (currentPlayerIndex+1)%players.size()));
    }
}
