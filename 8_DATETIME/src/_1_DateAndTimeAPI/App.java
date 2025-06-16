package _1_DateAndTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class App {
    public static void main(String[] args) {
        //LocalDate
            //
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2050, 1, 1);
        LocalDate date3 = LocalDate.parse("2050-10-01");

        //utilizando padrão brasileiro de data
        LocalDate date4 = LocalDate.parse("05/12/2012", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(date+"\n"+date2+"\n"+date3+"\n"+date4);

        //operação com objs LocalDate
        LocalDate date5 = LocalDate.of(1990,1,1);
        LocalDate dateTroc = date5.withYear(2000);
        LocalDate datePlus = dateTroc.plusYears(5);
        LocalDate dateMinus = dateTroc.minusYears(5);
        System.out.println(dateTroc);
        System.out.println(datePlus);
        System.out.println(dateMinus);

        //transformar em string
        String dateStr = date5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dateStr);
    }
}
