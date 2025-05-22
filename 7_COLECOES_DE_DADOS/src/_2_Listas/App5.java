package _2_Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App5 {
    public static void main(String[] args) {
        //Ordenando listas
        var list = new ArrayList<>(List.of(6,8,1,3,5,4,8,3,2,7));
        //usamos a classe Colletions para usar o métod-o sort que modifica a lista, ordenando-a
        Collections.sort(list);
        System.out.println(list);
        //OBS.: se queremos criar listas/classes, só é possível ordernar se o tipo da lista/classe implementar a interface
        //Comparable
        //  pq? A interface Comparable possui o métod-o compareTo/compare que retorna, em Integers por exemplo, 0 se forem iguais
        // menor que 0 se o valor no parâmetro é maior que o valor avaliado ou positivo se o valor no parâmetro é menor
        // que o valor avaliado

        //podemos fazer o sort também com um Comparator
        list.sort(new DescendingComparator());
        System.out.println(list);
        list.sort(new DescendingComparator().reversed());
        System.out.println(list);
    }
}

class DescendingComparator implements Comparator<Integer> {
    //criando a classe

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2); //retorna uma ordem decrescente
    }
}
