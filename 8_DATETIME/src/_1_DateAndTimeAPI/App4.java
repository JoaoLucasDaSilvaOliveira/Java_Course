package _1_DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class App4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2000, 3,1,15,0);
        // fuso horário
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.UTC);
        OffsetDateTime odt2 = odt.withOffsetSameInstant(ZoneOffset.of("-03:00"));
        System.out.println(odt);
        System.out.println(odt2);

        //analisa pelos fusos
        System.out.println(odt2.isEqual(odt));
    }
}
