package Wrappers;

public class WrapperApp1 {
    public static void main(String[] args) {
        //Integer
        Integer n1 = Integer.valueOf("10");
        //retorna o valor de n1;
        int i = n1.intValue();
        //podemos transformar em qlqr outro tipo primitivo
        double x = n1.doubleValue();
        //toString mostra o valor convertido
        System.out.println(n1);
    }
}
