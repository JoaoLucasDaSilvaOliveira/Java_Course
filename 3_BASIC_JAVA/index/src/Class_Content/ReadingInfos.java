package Class_Content;

import java.util.Scanner;

public class ReadingInfos {
    public static void main(String[] args) {
        //usaremos um scanner!
            /*podemos declarar como:
                var scanner = new Scanner(System.in);
                Scanner scanner = new java.util.Scanner(System.in);
            */
        Scanner scanner = new Scanner(System.in);
        //obs.: System.out.print sem o ln não quebra a linha após a execução, fazendo com que o texto fique na mesma linha;
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println(nome + " " + sobrenome);
    }
}
