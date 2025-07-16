package _2_UsosPraticosdaAPI;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class App5 {
    public static void main(String[] args) {
        //comparação de datas e horas
        OffsetDateTime odt1 = OffsetDateTime.of(
                2000, 1,1, 12, 0, 0, 0, ZoneOffset.of("-00:00")
        );

        OffsetDateTime odt2 = OffsetDateTime.of(
                2000, 1,1, 11, 0, 0, 0, ZoneOffset.of("-01:00")
        );

        System.out.println(odt1.equals(odt2)); //erro, não funciona bem pois compara os elementos do OffSetDateTime, como o offsetid é diferente considera diferente, mas são apenas fusos diferentes, nesse caso é o mesmo horário!!!
        System.out.println(odt1.isEqual(odt2)); //esse sim funciona, converte ambos os objs para um EPOCH seconds, compara instantes de tempo!!!
    }
}
