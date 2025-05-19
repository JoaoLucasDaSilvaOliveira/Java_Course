package N25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String st = numberRemover("o1 tenho2 3 4 23 anos");
        String st2 = charRemover("o1 tenho2 3 4 23 anos");
        System.out.println(st);
        System.out.println(st2);
    }
    private static String numberRemover (String strWithNumbers){
        //podemos fazer assim:
            /*Scanner scan = new Scanner(strWithNumbers);
            scan.useDelimiter("[0-9]");
            StringBuilder sb = new StringBuilder();
            while (scan.hasNext()){
                sb.append(scan.next());
            }
            return sb.toString();*/
        //ou assim:
        return strWithNumbers.replaceAll("[0-9]", "");
    }

    private static String charRemover (String strWithLetters){
        //podemos fazer assim:
            /*Scanner scan = new Scanner(strWithNumbers);
            scan.useDelimiter("[0-9]");
            StringBuilder sb = new StringBuilder();
            while (scan.hasNext()){
                sb.append(scan.next());
            }
            return sb.toString();*/
        //ou assim:
        return strWithLetters.replaceAll("[^0-9]", "");
    }
}
