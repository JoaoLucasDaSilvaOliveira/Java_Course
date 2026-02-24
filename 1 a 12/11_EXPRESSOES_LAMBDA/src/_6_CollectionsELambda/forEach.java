package _6_CollectionsELambda;

import java.util.ArrayList;
import java.util.List;

public class forEach {
    //agora sabendo interfaces padrões do java, podemos ver o .forEach
    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(1,2,34,546));
        list.forEach(System.out::println); //recebe um Consumer
        list.forEach(n -> System.out.println(n+1));
    }
}
