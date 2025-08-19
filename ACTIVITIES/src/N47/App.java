package N47;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class App {

    public static void main(String[] args) {
        filter(
            new ArrayList<>(List.of(1,2,4,5,6,9)),
                (l) -> {
                    l.removeIf(i -> i % 2 != 0);
                    System.out.println(l);
                }
        );
    }

    public static void filter (List<Integer> numeros, Condition condition){
        condition.filter(numeros);
    }

    @FunctionalInterface
    interface Condition {
        void filter (List<Integer> objects);
    }
}
