package _3_Reduce;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> item = List.of(
                "Cebola", "Batata", "Arroz", "Feijão"
        );
        System.out.println(item.stream().reduce(String::concat));
    }
}
