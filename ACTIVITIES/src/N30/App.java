package N30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        var listaRandom = randomList(10);
        System.out.println(listaRandom);

        /*listaRandom.addAll(List.of(1,2,3,4,6));
        System.out.println(listaRandom);*/
    }
    private static List<Integer> randomList (int x){
        Random r = new Random();
        List<Integer> lista = new ArrayList<>(x);
        for (int i =0; i<x; i++){
            lista.add(r.nextInt(0, 101));
        }
        Collections.sort(lista);
        return lista;
        //obs.: podemos retornar também, oq não tinha sido visto antes, uma lista que não pode ser alterada, com:
        //return Collections.unmodifiableList(lista);
    }
}
