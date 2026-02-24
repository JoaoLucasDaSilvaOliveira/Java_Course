package _2_Listas;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //conhecendo as listas
        //ArrayList
        //ArrayList<String> lista = new ArrayList<String>(); pode fazer assim
        //elementos ao serem adicionados vão para o fim da lista
        //listas se expandem sozinhas conforme a necessidade

        ArrayList<String> lista = new ArrayList<>(); // ou assim // podemos passar como param o tamanho inicial da lista

        //add() -> adicionando elementos na lista
        lista.add("Aiai");
        lista.add("Oioi");

        //toString() -> funciona de forma semelhante ao Arrays.toString()
        System.out.println(lista);

        //iterando a lista
        for (String s : lista){
            System.out.println(s);
        }

        //get() -> retorna o elemento da lista; recebe como parametro a posição do elemento; throws an error in case as index out of bounds
        System.out.println(lista.get(1));
        //getFirst() -> retorna o primeiro elemento; getLast() -> retorna o último elemento da lista;

        //remove() -> remove um índice da lista com base no index passado como parametro ou Obj
        System.out.println(lista.remove(0)); // retorna o elemento que foi tirado da lista

    }
}
