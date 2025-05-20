package _2_Listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        //listas imutaveis
        List.of(); //lista vazia
        var lista = List.of("A", "B", "C", "D"); //detecta o tipo automaticamente, sem precisar do generics
        List<Integer> listinha = List.of(1,2,4,3,5,6,8); // precisamos dizer o tipo
        /*lista.add("E");*/ // não funciona, objeto da lista é imutável

        //mas isso podemos fazer

        List<String> l = new ArrayList<String>(List.of("João", "Pedro", "Henrique")); //dessa forma inicalizamos um arraylist
        // com uma lista de valores;
        System.out.println(l);
        l.add("Juliano");
        System.out.println(l);
        l.remove(0);
        System.out.println(l);

        //e veja que podemos iterar listas imutaveis tb sem problema algum
        for (Integer d : listinha){
            System.out.printf("%d ", d);
        }
        System.out.println();
        //EXTRA: maneiras diferentes (incomuns) de iterar listas
        //for tradicional -> te da tod-0 o controle de o que fazer com a iteração
        for (int i=0; i < listinha.size(); i++){
            System.out.printf("%d ", listinha.get(i));
        }
        System.out.println();
        //Iterator
        // usa o tipo generico da própria lista!!
        //pq usar iterator? quando usamos o enhanced for, por exemplo, não conseguimos excluir ou modificar os elementos
        //da lista durante a iteração, com o iterator ou com o for tradicional conseguimos!
        //  OBS.: durante a exclusão em listas, os índices na lista mudam, e talvez possa bugar o valor de i com o for tradicional
        //  caso você não esteja preparado para isso. Por isso usar o iterator é mais indicado, pois o próprio sistema
        //  se encarrega disso.
        Iterator<String> iter = l.iterator();
        while (iter.hasNext()){
            String s = iter.next(); //retorna o próximo elemento da iteração
            if (s.equals("Pedro")){
                iter.remove(); // remove o elemento que está atualmente sendo iterado e se reorganiza nos índices
            }
        }
        System.out.println(l);
    }
}
