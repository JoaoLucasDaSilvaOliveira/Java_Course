package _1_JogoDaVelha.core;

import _1_JogoDaVelha.io.Input;
import _1_JogoDaVelha.io.OutPut;
import _1_JogoDaVelha.util.ValidationUtils;

public class Game {

    private final Board board = new Board();
    private final Players players = new Players();

    public void start (){
        Symbol winner = null;
        while (winner == null && board.findWhiteSpaces()){
            OutPut.writeNewLine();
            OutPut.write(board);
            winner = play(players.next());
        }
        OutPut.writeNewLine();
        OutPut.write(board);
        if (winner != null){
            OutPut.write(String.format("O vencedor é %s", winner));
        } else {
            int resp;
            while (true){
                OutPut.write("Deu velha\nJogar novamente? 1-Sim 2-Não\nOpção: ");
                resp = Integer.parseInt(Input.read(null));
                try {
                    ValidationUtils.require(resp >=1 && resp<=2, "Valor incorreto!");
                    break;
                } catch (RuntimeException e) {
                    continue;
                }
            }
            if (resp == 1){
                Game game = new Game();
                game.start();
            } else {
                OutPut.write("Obrigado por jogar!");
            }
        }
    }

    public Symbol play (Symbol symbol){
        while (true){
            try {
                String play = Input.read(String.format("%s Play => ", symbol));
                Coord coord = Coord.parse(play);
                return board.update(symbol, coord);
            } catch (RuntimeException e) {
                OutPut.write("ERROR: "+ e.getMessage(), true);
                OutPut.writeNewLine();
                OutPut.write(board);
            }
        }
    }
}
