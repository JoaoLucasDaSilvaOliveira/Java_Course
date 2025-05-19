package _2_Expressões_Regulares_or_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        //utilizamos quando queremos encontrar padrões dentro de um conjunto de informações
        String text = "abcabc";
        String regex = "ab";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while(m.find()){ //m.find() retorna um booleano caso tenha encontrado o padrão
            System.out.format("%d ~ %d -> '%s'\n", m.start(),m.end()-1, m.group());
            //m.start() retorna a posição indexada onde foi encontrado o Pattern
            //m.end() retorna a posição indexada onde finda o padrão. O retorno sempre será onde não tem o padrão
            //  EX.: início do padrão na posição 4 e fim na posição 5, a posição 5 já não faz mais parte do padrão
            //  se quisermos saber de fato a última posição do padrão, temos que procurar pelo end()-1;
            //m.group() retorna o grupo procurado pelo Pattern
        }
    }
}
