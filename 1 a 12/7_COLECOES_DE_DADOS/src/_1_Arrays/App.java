package _1_Arrays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        //arrays
        //  tem tamanho fixo
        //criando...
        int[] array = new int[5];
        double[] array2 = new double[5];
        String[] array3 = new String[5];
        boolean[] array4 = new boolean[5];
        array[0] = 2;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));

        //outra forma de fazer:
        int[] array5 = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(array5));
        int[] array6 = {6,7,8,9,10};
        System.out.println(Arrays.toString(array6));
    }
}
