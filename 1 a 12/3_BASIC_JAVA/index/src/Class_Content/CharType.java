package Class_Content;

public class CharType {
    public static void main(String[] args) {
        /*
            TEORIA:
                - O char é um tipo de dado que armazena um unico caractere;
                - O char é um número inteiro sem sinal;
                - Precisa ser iniciado com apóstrofo (aspas simples);
         */

        char c1 = 'a';
        int n1 = c1;
        System.out.println(c1);
        System.out.println(n1);
        // o número 97 na tabela ASCII representa o caractere 'a';
        char c2 = 97;
        System.out.println(c2);
        char c3 = 100;
        System.out.println(c3 + "\n");
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + " - " + (char)i);
        }
    }
}
