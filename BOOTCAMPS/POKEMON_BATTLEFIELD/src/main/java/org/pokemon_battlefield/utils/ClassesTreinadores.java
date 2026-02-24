package org.pokemon_battlefield.utils;

public enum ClassesTreinadores {
    BERSEKER(5, 0, "Berseker"),
    DEFENDER(0,5, "Defender"),
    TATIC(1, 2, "Tatic"),
    INTELIGENT(3, 3, "Inteligent");

    private final int atq;
    private final int def;
    private final String name;

    ClassesTreinadores(int atq, int def, String name) {
        this.name = name;
        this.atq = atq;
        this.def = def;
    }

    public int getAtq() {
        return atq;
    }

    public int getDef() {
        return def;
    }

    public String getName() {
        return name;
    }

}
