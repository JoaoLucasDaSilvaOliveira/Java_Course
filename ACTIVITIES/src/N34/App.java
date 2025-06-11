package N34;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        System.out.println(counter("GARRAFA"));
        System.out.println(counter("JAVA"));
    }
    public static Map<Character, Integer> counter (String counting){
        char[] chars = counting.toCharArray();
        Map<Character, Integer> mapa = new TreeMap<>();

        for (char c : chars){
            if (!mapa.containsKey(c)){
                mapa.put(c, 1);
            } else {
                Integer n = mapa.get(c);
                mapa.put(c, ++n);
            }
        }
        return mapa;
    }
}
