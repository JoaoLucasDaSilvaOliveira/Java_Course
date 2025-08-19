package N51;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        String source = "Pão de batata";
        List<Character> buffer = new ArrayList<>();
        //COLOCANDO OS CARACTERES DA STRING DENTRO DE UMA LISTA
        for (int i=0; i<source.length(); i++){
               buffer.add(source.charAt(i));
        }
        //AGORA TEMOS UMA LISTA ONDE PODEMOS APLICAR A TÉCNICA DE STREAM
        var result = buffer.stream()
                .filter(c-> !(c== ' '))
                .map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
