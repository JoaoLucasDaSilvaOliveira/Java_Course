package _1_Criando;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        //STREAMS NÃO MUDAM A FONTE DOS DADOS!
        List<People> pessoas = List.of(
                new People("João", 21),
                new People("Mari", 42),
                new People("Mariana", 1),
                new People("Julia", 31),
                new People("Carolina", 11)
        );

        Stream<People> peopleStream = pessoas.stream();
        peopleStream.map(People::name).map(String::toUpperCase).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        pessoas.stream().filter((people -> people.age()>=18)).map(people -> String.format("%s %s anos", people.name(), people.age())).forEach(System.out::println);

        //MAPEANDO PARA TIPOS PRIMITIVOS
        int max = pessoas
                .stream()
                .mapToInt(People::age)
                .max().orElse(0);

        int min = pessoas
                .stream()
                .mapToInt(People::age)
                .min().orElse(0);

        double avg = pessoas
                .stream()
                .mapToInt(People::age)
                .average().orElse(0);

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);

    }
    public record People (String name, int age){}
}
