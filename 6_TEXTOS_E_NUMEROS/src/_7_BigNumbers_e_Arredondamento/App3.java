package _7_BigNumbers_e_Arredondamento;

import java.math.BigDecimal;

public class App3 {
    public static void main(String[] args) {
        //comparando valores de BigNumbers
        BigDecimal b1 = BigDecimal.valueOf(1.0);
        BigDecimal b2 = BigDecimal.valueOf(1);
        System.out.println(b1==b2); // saída: false; avalia os endereços de memória
        System.out.println(b1.compareTo(b2)); // funciona: retorna 0 se for igual
        System.out.println(b1.equals(b2)); // não funciona tb
    }
}
