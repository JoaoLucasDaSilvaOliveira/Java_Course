package _7_BigNumbers_e_Arredondamento;

import java.math.BigDecimal;

public class App2 {
    public static void main(String[] args) {
        //trabalhando com valores monetários
        /*imagine que:*/ double saldo = 1.90;
        System.out.println(saldo); // saída: 1.90;
        /*agora imagine que:*/ saldo -= 0.60;
        System.out.println(saldo); // saída: 1.2999999999999998
        //sempre quando trabalhamos com tipos primitivos não temos essa precisão!
        //podemos resolver o problema de duas formas:
        //  1) tratando dinheiro sempre como int e manipulando a vírgula virtualmente
        //  2) usando BigDecimal, como veremos agora
        BigDecimal dinero = new BigDecimal("1.90"); // ou BigDecimal dinero = BigDecimal.valueOf(1.90);
        System.out.println(dinero);
        dinero = dinero.subtract(BigDecimal.valueOf(0.62));
        System.out.println(dinero);
    }
}
