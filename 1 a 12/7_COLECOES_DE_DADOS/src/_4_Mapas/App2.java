package _4_Mapas;

import java.util.HashMap;
import java.util.*;

public class App2 {
    public static void main(String[] args) {
        //Iterando um mapa
        Map<String, Integer> jogadores = new HashMap<>();
        jogadores.put("Jogador A", 1000);
        jogadores.put("Jogador B", 100);
        jogadores.put("Jogador C", 10000);
        jogadores.put("Jogador D", 700);

        //iterando pelas chaves -> recebe o nome das chaves
        Set<String> keys = jogadores.keySet();
        System.out.println(keys);

        //iterando pelo valores -> recebe os valores das chaves
        Collection<Integer> values = jogadores.values();
        System.out.println(values);

        //iterando por pares de chaves e valores
        Set<Map.Entry<String, Integer>> chavesEValores = jogadores.entrySet();
        for (Map.Entry<String, Integer> entry : chavesEValores){
            System.out.println(entry);
        }
    }
}
