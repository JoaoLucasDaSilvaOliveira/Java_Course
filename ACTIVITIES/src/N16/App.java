package N16;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double n1 = readNumber(scanner);
        double n2 = readNumber(scanner);
        System.out.println("Soma: "+(n1+n2));

    }
    public static double readNumber (Scanner s){
        System.out.print("Por favor digite um número: ");
        try {
            return Double.parseDouble(s.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: assumindo valor 10!");
            return  10;
        }
    }
}
