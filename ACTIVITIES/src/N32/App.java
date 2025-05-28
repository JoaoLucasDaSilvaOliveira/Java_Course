package N32;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        //teste
        Player jogador1 = new Player("João", 1000);
        Player jogador2 = new Player("Maria", 100000);
        Player jogador3 = new Player("Maria", 1);

        Rank.printRanking();
        Rank.addPlayer(jogador1);
        Rank.printRanking();
        Rank.addPlayer(jogador2);
        Rank.addPlayer(jogador3);
        Rank.addPlayer(jogador3); // testando pra ver se adiciona em duplicidade!
        System.out.println("Printando o SET");
        Rank.printRanking();
    }
}

record Player (String name, int score){
}

class Rank {
    static {
        Rank.players = new TreeSet<>(new rankComparator());
    }

    private Rank (){ };

    private static Set<Player> players;

    /***
     * faz uma saída no terminal com os nomes dos players e os seus respectivos scores
     */
    public static void printRanking (){
        if (Rank.players.isEmpty()){
            System.out.println("Ainda não há players cadastrados no sistema!");
        } else {
            int pos = 1;
            for (Player p : Rank.players){
                System.out.printf("%d° %-5s Pontuação: %d\n",pos++, p.name(), p.score());
            }
        }
    }

    /***
     * Não adiciona players duplicados!
     * @param inserting
     */
    public static void addPlayer (Player inserting){
        boolean exists = false;
        for (Player p : Rank.players){
            if (p.name().equals(inserting.name())){
                exists = true;
                break;
            }
        }
        if (exists == false){
            Rank.players.add(inserting);
        }
    }
}
//poderia ter feito a ordenação com Player implementando Comparable, mas eu não quis
/***
 * Classe de ordenação para usar no Rank
 */
class rankComparator implements Comparator<Player> {
    /***
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a ordem em formato decrescente
     */
    @Override
    public int compare(Player o1, Player o2) {
        return -Integer.compare(o1.score(), o2.score());
    }

}


