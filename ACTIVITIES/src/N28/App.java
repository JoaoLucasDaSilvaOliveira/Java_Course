package N28;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int [] nros = {1,2,3,4};
        square(nros);
        System.out.println(Arrays.toString(nros));
    }
    private static void square (int[] integers){
        for (int i = 0; i< integers.length; i++){
            integers[i] = (int)Math.pow(integers[i], 2);
        }
    }
}
