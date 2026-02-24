package Classes.Exceptions;

import java.util.Scanner;

public class App3 {
    //2) não queremos tratar aqui, logo deixaremos que quem implementa a class App3 (JMV) trate a Exception
    //                                         |
    //                                        V
    public static void main(String[] args) throws Exception{
        var conta = new Account3("02");
        conta.deposit(1000);
        var scanner = new Scanner(System.in);

        // 1) como propagamos a Exception, precisamos ou tratá-la com um bloco try/catch, ou a propagamos
        conta.withdraw(Double.parseDouble(scanner.nextLine()));

        System.out.println(conta.toString());
    }
}
