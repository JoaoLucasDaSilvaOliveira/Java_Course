package N22;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        convertNumber(ask4Number());
    }

    private static int ask4Number(){
        while (true){
            try {
                Scanner scanf = new Scanner(System.in);
                System.out.print("Por favor, digite um numero inteiro: ");
                return Integer.parseInt(scanf.nextLine());
            } catch (NumberFormatException ignore){
            }
        }
    }
    private static void convertNumber (int numberToFormat){
        System.out.println("Binario: "+Integer.toBinaryString(numberToFormat));
        System.out.println("Hexadecimal: "+Integer.toHexString(numberToFormat));
        System.out.println("Octal: "+Integer.toOctalString(numberToFormat));
    }
}
