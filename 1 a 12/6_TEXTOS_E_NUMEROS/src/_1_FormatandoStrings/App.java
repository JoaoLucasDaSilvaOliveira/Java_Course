package _1_FormatandoStrings;

public class App {
    public static void main(String[] args) {
        //criando strings de outras formas
        int n = 2;
        for (int i = 1; i<=10; i++ ){
            //String s = n +" x "+i+" = " + (n*i);
            String s = String.format("%d x %d = %d", n, i, n*i);
            System.out.println(s);
            System.out.format("%d x %d = %d\n", n, i, n*i);//temos o mesmo resultado só que sem criar uma string
        }
    }
}
