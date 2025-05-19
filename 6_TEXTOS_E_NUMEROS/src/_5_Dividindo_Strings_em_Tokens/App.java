package _5_Dividindo_Strings_em_Tokens;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String text = "a,b1,c,d";
        String t = "a1b2c33f5";
        String[] tokens = text.split(","); // procura e faz a quebra na ,
        String[] tokens2 = t.split("\\d+"); // procura por 1 ou mais dígitos numéricos
        System.out.println(Arrays.toString(tokens));
        System.out.println(Arrays.toString(tokens2));

        //outra forma de fazer:
        Scanner scan = new Scanner(text);
        scan.useDelimiter(",");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        Scanner scanner = new Scanner("1,2,3,4,5"); // se colocar por ex.: "1,2,3a,4,5" executa somente até o 2 e breca
        scanner.useDelimiter(",");
        while (scanner.hasNextInt()){
            int e = scanner.nextInt();
            System.out.printf("%d - ", e);
        }
    }
}
