package _3_Matches_e_padrões;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        //usando .matches() para encontrar padrões;
        Pattern p = Pattern.compile("\\s"); // procura um espaço em branco na string;
        Matcher m = p.matcher("abc def");
        System.out.println(m.matches()); // saída: false. Pq? Pois ele está procurando apenas o espaço em branco
        //para evitar isso fazemos assim:
        Pattern p2 = Pattern.compile("\\w*\\s\\w*"); // procura um espaço entre nenhum ou um caracter;
        Matcher m2 = p2.matcher("abc def");
        System.out.println(m2.matches());
        System.out.println("11234".matches("\\d+")); //invocamos o matches sobrescrito da classe String e passamos a procura para
                                                         // localizar se a string é composta de um ou mais números
    }
}
