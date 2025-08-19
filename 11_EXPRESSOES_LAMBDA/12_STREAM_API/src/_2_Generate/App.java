package _2_Generate;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        //CRIANDO CONTEÚDOS INFINITOS OU FINITOS
        //  GERANDO NÚMEROS INFINITAMENTE
        /*IntStream numbers = Stream.generate(()-> 5).mapToInt(n -> n);
        numbers.forEach(System.out::println);*/
        //  GERANDO NÚMEROS FINITAMENTE
        List<Integer> numbers = Stream.generate(()-> 5).limit(5).toList();
        numbers.forEach(System.out::println);

        //GERANDO NÚMEROS RANDOMICOS
        Stream.generate(()->{
            Random r = new Random();
            return r.nextInt(0, 11);
        }).limit(3).toList().forEach((e)-> System.out.printf("%s - ", e));
    }
}
