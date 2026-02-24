package _2_Expressões_Regulares_or_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App2 {
    public static void main(String[] args) {
        //mais sobre expressões regulares
        // \d   :procura os caracteres numéricos
        //[]    : posso procurar ou algo ou outro algo
        // +    : usamos junto de outra expressão para indicar que queremos um conjunto de um ou mais elementos
        // verificar javadoc para mais expressões regulares
        printMatches("suwbdiw77bd6846awud789**2++--", "\\d"); //procura um dígito qualquer
        System.out.println("-----------------------------------------------------");
        printMatches("suwbdiw77bd6846awud789**2++--", "\\d\\d"); //procura um dígito seguido de outro dígito
        System.out.println("-----------------------------------------------------");
        printMatches("suwbdiw77bd6846awud789**2++--", "\\d\\d\\d"); //procura um dígito seguido de outros dois dígitos
        System.out.println("-----------------------------------------------------");
        printMatches("suwbdiw77bd6846awud789**2++--z", "[az]"); //procura ou a, ou z
        System.out.println("-----------------------------------------------------");
        printMatches("suwbdiw77bd6846awud789**2++--z", "[a-z]"); //procura caracteres de a até z isolados
        System.out.println("-----------------------------------------------------");
        printMatches("suwbdiw77bd6846awud789**2++--z", "([a-z])+"); //procura um ou mais caracteres de a até z juntos ou isolados
        System.out.println("-----------------------------------------------------");
        printMatches("suwbdiw77bd6846awud789**2++--7z", "\\d([a-z])+");
        //procura um ou mais caracteres de a até z juntos ou isolados e que antes tenha um dígito

    }
    private static void printMatches(String text, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while (m.find()){
            System.out.printf("%d ~ %d -> '%s'\n", m.start(), m.end()-1, m.group());
        }
    }
}
