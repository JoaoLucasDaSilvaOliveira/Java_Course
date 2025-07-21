package _1_JogoDaVelha.io;

import java.util.Scanner;

public final class Input {
    private Input (){}

    public static String read (String message){
        if (message != null){
            OutPut.write(message+ " ", false);
        }

        return new Scanner(System.in).nextLine();
    }
}




