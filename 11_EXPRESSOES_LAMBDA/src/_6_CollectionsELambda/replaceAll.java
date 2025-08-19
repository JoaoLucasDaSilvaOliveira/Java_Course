package _6_CollectionsELambda;

import java.util.Arrays;

public class replaceAll {
    public static void main(String[] args) {
        var numbers  = Arrays.asList(0,1,2,3,4,5);
        numbers.replaceAll(n -> n*2);//recebe um UnaryOperator que recebe um valor de um tipo e retorna um valor desse mesmo tipo
        //UnaryOperador extende Function (que recebe um valor de um tipo e retorna um valor de outro tipo)
    }
}
