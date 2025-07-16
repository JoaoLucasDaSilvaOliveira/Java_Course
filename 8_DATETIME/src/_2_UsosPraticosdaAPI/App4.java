package _2_UsosPraticosdaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class App4 {
    public static void main(String[] args) {
        //truncando elementos temporais
        var time = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(time);
        System.out.println(time.truncatedTo(ChronoUnit.SECONDS));
        LocalDate dt = LocalDate.of(2025,6,20);
    }
}
