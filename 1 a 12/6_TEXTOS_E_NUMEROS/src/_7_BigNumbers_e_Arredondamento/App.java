package _7_BigNumbers_e_Arredondamento;

import java.math.BigDecimal;
import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        //BigInteger
        //  é virtualmente infinito, pode colocar um nro de qlqr tamanho
        //  são imutáveis
        //  qualquer alteração (soma, sub...) cria um novo BigInteger;
        BigInteger b = new BigInteger("123456789132546984681681681818842313813844818181648454685465468454684654351884");

        //obs.: não podemos fazer operações aritméticas com o BigInteger normalmente, ex b+=b;
        //  precisamos utilizar os métodos do BigInteger;
        System.out.println(b);
        BigInteger bPlus10 = b.add(BigInteger.TEN);
        /*BigInteger bPlus10 = b.add(BigInteger.valueOf(10L));*/ // outra alternativa
        System.out.println(bPlus10);

        //BigDecimal
        //  é virtualmente infinito tb
        //  são imutáveis
        //  qualquer alteração gera um novo BigDecimal
        //  usamos quando queremos nros com ponto flutuante
        BigDecimal bd = new BigDecimal("1354684651684684684684684.35138168461681681681681");
        System.out.println(bd);
        System.out.println(bd.add(BigDecimal.valueOf(10)));
        System.out.println(bd.multiply(BigDecimal.valueOf(10)));
    }
}
