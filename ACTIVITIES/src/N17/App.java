package N17;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //ORIENTAÇÃO: inverta a String dada pelo usuário;
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor digite uma String: ");
        String str = scan.nextLine();
        StringBuilder temp = new StringBuilder();
        if (!str.isBlank()){
            for (int i =str.length()-1; i >= 0; i--){
                temp.append(str.charAt(i));
            }
        }
        System.out.println(temp);
        // ou podemos fazer assim:
        System.out.println(new StringBuilder(str).reverse());
    }
}
