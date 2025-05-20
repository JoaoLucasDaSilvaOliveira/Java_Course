package _2_Listas;

import java.util.ArrayList;
import java.util.List;

public class App4 {
    public static void main(String[] args) {
        //operações entre listas
        var list1 = new ArrayList<>(List.of('A', 'B', 'C'));
        var list2 = new ArrayList<>(List.of('D','C', 'E'));

        //somar listas a outras
        list1.add('F');
        System.out.println(list1);
        //list1.addAll(list2);
        System.out.println(list1);

        //intersecção -> modifica a lista com base na intersecção entre as listas
        list1.retainAll(list2);
        System.out.println(list1);

        //removeAll -> remove a intersecção entre as listas
        list1.removeAll(list2);
        System.out.println(list1);
    }
}
