package _7_BigNumbers_e_Arredondamento;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App4 {
    public static void main(String[] args) {
        //arredondamento com tipos primitivos
        double n = 10.5;
        long v = Math.round(n); // de 4 para cima arredonda para cima // 10.5 vira 11; retorna um long
        System.out.println(v);
        double y = Math.floor(n); // sempre arredonda para baixo // 10.5 vira 10; retorna um double
        System.out.println(y);
        double c = /*(long ou int para trabalhar com valor sem pto flutuante)*/Math.ceil(n); // sempre arredonda para
        // cima // 10.5 vira 11; retorna um double

        //arredondamento com BigNumbers
        BigDecimal b = BigDecimal.valueOf(10.43);
        b=b.setScale(1, RoundingMode.UP);//seta o nro de casas decimais e o RoundingMode(como o sistema vai arredondar);
        System.out.println(b);
    }
}
