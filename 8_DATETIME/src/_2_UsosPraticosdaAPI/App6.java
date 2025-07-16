package _2_UsosPraticosdaAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class App6 {
    public static void main(String[] args) {
        //verificando se uma data está num intervalo
        var start = LocalDate.of(2025,6,25).atStartOfDay().atOffset(ZoneOffset.UTC);
        var end = LocalDate.of(2030, 12, 31).atTime(LocalTime.MAX).atOffset(ZoneOffset.UTC);

        var now = OffsetDateTime.now();
        System.out.println(inRange(now, start, end));
    }
    private static boolean inRange (OffsetDateTime now, OffsetDateTime start, OffsetDateTime end){
        //usar metodos isAfter e isBefore
        return now.isAfter(start) && now.isBefore(end) ||  now.isEqual(start) || now.isEqual(end);
    }
}
