package _1_DateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class App5 {
    public static void main(String[] args) {
        // ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Sao_Paulo"));
        System.out.println(zdt);
        //retorna um set
        System.out.println(ZoneId.getAvailableZoneIds());
    }
}
