package _6_CollectionsELambda;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class sort {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of(
                "João", "Lucas", "Pedro", "Hiago", "Luís"
        ));
        names.forEach((string)-> System.out.print(string + " - "));
        names.sort((str1, str2)-> {
            return str1.compareTo(str2);
        });
        System.out.println();
        names.forEach((string)-> System.out.print(string + " - "));
    }
}
