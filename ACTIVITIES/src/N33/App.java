package N33;

import java.util.*;


public class App {
    public static void main(String[] args) {
        ArrayList<String> lista  = new ArrayList<>();
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Arroz");
        lista.add("Tomate");
        lista.add("Queijo");
        lista.add("Queijo");
        lista.add("Bife");
        lista.add("Frango");
        Collections.sort(lista);
        System.out.println("Lista sem formatação: " +  lista);
        removeDuplicated(lista);
        System.out.println("Lista com formatação: " +  lista);
    }

    public static void removeDuplicated (Collection<String> dados){
        Set<String> set = new LinkedHashSet<>(dados);
        dados.clear();
        dados.addAll(set);
    }
}
