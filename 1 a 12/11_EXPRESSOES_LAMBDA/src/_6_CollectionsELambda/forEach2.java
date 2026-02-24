package _6_CollectionsELambda;

import java.util.LinkedHashMap;
import java.util.Map;

public class forEach2 {
    public static void main(String[] args) {
        //usando .forEach em mapas
        Map<String, Object> json = new LinkedHashMap<>(Map.of(
                "nome", "João",
                "idade", 20,
                "altura", 1.71
        ));

        json.forEach((k, v) ->
            System.out.printf("Característica do indivíduo -> %-7s - %s\n", k, v)
        );
    }
}
