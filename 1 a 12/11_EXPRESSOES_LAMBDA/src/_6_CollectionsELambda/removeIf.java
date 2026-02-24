package _6_CollectionsELambda;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class removeIf {
    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(1,2,34,546));
        list.removeIf((number)-> number%2==0);
        list.forEach(System.out::println);
    }
}
