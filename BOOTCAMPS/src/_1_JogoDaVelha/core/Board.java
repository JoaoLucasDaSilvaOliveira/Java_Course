package _1_JogoDaVelha.core;

import java.util.Objects;

public class Board {
    public static final int SIZE = 3;
    private final Symbol[][] board = new Symbol[SIZE][SIZE];

    public Board (){
        for (int i =0; i <SIZE; i++){
            for (int j = 0; j<SIZE; j++){
                board[i][j] = Symbol.NONE;
            }
        }
    }

    public Symbol update (Symbol symbol, Coord coord){
        Objects.requireNonNull(symbol);
        Objects.requireNonNull(coord);

        if (symbol == Symbol.NONE){
            throw new IllegalArgumentException("Symbol cannot be NONE");
        }

        if (board[coord.i()][coord.j()] != Symbol.NONE){
            throw new IllegalArgumentException("Play is not possible");
        }
        board[coord.i()][coord.j()] = symbol;
        return findSequence();
    }

    private Symbol findSequence (){
        //TODO
        Symbol [] auxLinhas = new Symbol[SIZE];
        Symbol [] auxColunas = new Symbol[SIZE];
        //verificando as linhas e colunas
        for (int i = 0; i<SIZE; i++){
            for (int j = 0 ; j < SIZE ; j++){
                auxLinhas[j] = board[i][j];
                auxColunas[j] = board[j][i];
            }
            //verificando o array auxLinhas
            if ((auxLinhas[0] == auxLinhas[1] && auxLinhas[0] == auxLinhas[2]) && auxLinhas[0] != Symbol.NONE){
                return auxLinhas[0];
            }
            //verificando o array auxColunas
            if ((auxColunas[0] == auxColunas[1] && auxColunas[0] == auxColunas[2]) && auxColunas[0] != Symbol.NONE){
                return auxColunas[0];
            }
        }
        //verificando as diagonais
            //diagonal principal
            if (board[0][0] != Symbol.NONE && (board[0][0] == board[1][1] && board[0][0] == board[2][2])){
                return board [0][0];
            }
        //verificando as diagonais
            //diagonal secundaria
            if (board[0][2] != Symbol.NONE && (board[0][2] == board[1][1] && board[0][2] == board[2][0])){
                return board [0][2];
            }

        //retorna null se ninguém ganhar ou empatar
        return null;
    }

    public boolean findWhiteSpaces (){
        for (int i = 0; i<SIZE; i++){
            for (int j = 0 ; j < SIZE ; j++){
                if (this.board[i][j] == Symbol.NONE){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i <SIZE; i++){
            sb.append(" ");
            for (int j = 0; j<SIZE; j++){
                sb.append(board[i][j]);
                if (j != 2){
                    sb.append(" | ");
                }
            }
            sb.append("\n");
            for (int j = 0; j<SIZE; j++){
                if (j != 2 && i!=2){
                    sb.append("---|");
                } else if (i!=2){
                    sb.append("---");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
