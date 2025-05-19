package Class_Content;

import java.util.Arrays;

public class ForOtherUsages {
    public static void main(String[] args) {
        int i,j;
        for (i = 0, j = 10; i <= 10; i++ , j++){
            System.out.println("i: " +i+" || j: "+j);
        }

        for (int x = 1; x<100; x*=2){
            System.out.println("x: "+x);
        }

        /*for ( ; ; ){
        }
        MESMO CONCEITO DO WHILE (TRUE)
        */
        int y=0;
        for(; y<10;){
            System.out.println(y);
            y++;
        }
        //MESMO CONCEITO DE WHILE (y<10);
    }
}
