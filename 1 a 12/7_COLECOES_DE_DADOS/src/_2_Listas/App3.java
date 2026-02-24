package _2_Listas;

import java.util.Arrays;
import java.util.List;

public class App3 {
    public static void main(String[] args) {
        //convertendo arrays e listas
        Integer [] array = {1,2,3,4,5};
        // array -> lista
        List<Integer> integ = Arrays.asList(array); // recebe varargs, ou seja, posso passar um array, ou os ítens; precisa passar Integer

        //lista -> array
        //  toArray tem duas sobrecargas, uma que retorna um array de Object, que pode ser que não queiramos usar
        //  e outra que colocamos onde queremos e que tipo queremos esse array
        Integer[] i = new Integer[4];
        i = integ.toArray(i);
        System.out.println(Arrays.toString(i));
    }
}
