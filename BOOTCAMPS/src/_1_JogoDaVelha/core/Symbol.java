package _1_JogoDaVelha.core;

public enum Symbol {
    X('X'),
    O('O'),
    NONE(' ');

    private final char symbol;

    Symbol (char symbol){
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(this.symbol);
    }
}
