package _1_Arrays;

public class App3 {
    public static void main(String[] args) {
        //arrays como params e varargs
        int sum = sum(new int[]{5, 6,2}); // array como parametro
        System.out.println(sum);

        //varArgs: é representado como se fosse um array
        //  a diferença é que quando chamamos a fç, não precisamos passar um array
        int sum2 = sumVarArgs(5,6,9,7,10);
        System.out.println(sum2);
    }
    private static int sum (int[] numbers){
        int sum =0;
        for (int n : numbers){
            sum+=n;
        }
        return sum;
    }
    //obs.: o varArgs sempre tem que ser único e o último elemento da fç
    private static int sumVarArgs (int ... numbers/*, String nome*/){
        int sum =0;
        for (int n : numbers){
            sum+=n;
        }
        return sum;
    }
}
