package _2_StreamDeDados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _12_LeituraDeDadosViaConsole {
    public static void main(String[] args) {
        //pensando de forma lógica: quando temos System.out onde temos uma escrita, nada mais é do que uma outputstream sendo escrita em nosso console.
        //quando temos uma leitura advinda do console, teremos então o System.in, uma inputstream do console.
        //podemos ler de várias maneiras!
            /*try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))){
                String text = bfr.readLine();
                System.out.println(new StringBuilder(text).reverse());
            }*/
        //é importante pensar que quando colocamos o leitor em um try with resourses, após o fechamento do canal, não podemos reabri-lo novamente, sendo assim, a melhor classe que temos para fazer a execução de leitura seria o scanner, pois ela não lança uma IOException em sua criação, enquanto o InputStreamReader lança
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(new StringBuilder(text).reverse());

    }
}
