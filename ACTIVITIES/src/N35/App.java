package N35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Person> pessoas = new ArrayList<>(
                List.of(
                    new Person("João", 2),
                    new Person("Iguinho", 5),
                    new Person("Pietra", 10)
                )
        );
        Map<Integer, String> mapPessoas = new HashMap<>();
        for (Person p : pessoas){
            mapPessoas.put(p.id(), p.name());
        }
        System.out.println("Lista de pessoas: "+pessoas);
        System.out.println("Mapa de pessoas: "+mapPessoas);
    }
}

record Person (String name, int id) { }
