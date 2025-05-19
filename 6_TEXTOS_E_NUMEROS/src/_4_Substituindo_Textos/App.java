package _4_Substituindo_Textos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String text = "senha:123456789";
        String regex = "\\d";
        String replacement = "*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        StringBuilder sb = new StringBuilder();

        while (m.find()){
            //o metodo recebe um StringBuilder e o que deve ser substituído
            m.appendReplacement(sb, replacement);
        }
        // sempre colocamos o appendTail pois pode ser o caso de ter algum valor que não foi iterado no find
        m.appendTail(sb);

        System.out.println(sb);
        String newStr = text.replaceAll(regex, "*"); // troca todas as ocorrências do regex.
        System.out.println(newStr);
        System.out.println(text.replaceFirst(regex, "*")); // troca apenas a primeira ocorrência do regex
    }
}
