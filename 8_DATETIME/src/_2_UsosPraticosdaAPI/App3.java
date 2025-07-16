package _2_UsosPraticosdaAPI;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class App3 {
    public static void main(String[] args) {
        //CHRONOUNIT
        var start = LocalDate.of(2000,1,1);
        var end = LocalDate.of(2000,12,31);
        System.out.println(ChronoUnit.DAYS.between(start, end));
        System.out.println(ChronoUnit.MONTHS.between(start, end));
        System.out.println(ChronoUnit.YEARS.between(start, end));

        //operações
        LocalDateTime ldt = ChronoUnit.HOURS.addTo(LocalDateTime.of(1990, 10, 15, 12, 0,0), 12);
        System.out.println(ldt);
    }
}
