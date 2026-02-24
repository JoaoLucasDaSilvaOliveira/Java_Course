package _2_UsosPraticosdaAPI;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        //guardando prazos
        YearMonth ym = YearMonth.of(2000, 12);
        System.out.println(ym);
        //trocar data
        ym.withYear(2010);
        System.out.println(ym.format(DateTimeFormatter.ofPattern("MM/yyyy")));
        YearMonth teste = YearMonth.parse("07/25", DateTimeFormatter.ofPattern("MM/yy"));
        System.out.println(teste);
    }
}
