package _1_DateAndTimeAPI;

import java.sql.SQLOutput;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class App6 {
    public static void main(String[] args) {
        //classe durantion
        //      para representar um intervalo
        //classe period
        Duration d = Duration.ofHours(3);
        Duration d2 = Duration.ofMinutes(63);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d2.toSeconds());

        //exemplo
        LocalTime lt = LocalTime.of(10,0);
        LocalTime lt2 = LocalTime.of(12,15);
        System.out.println(Duration.between(lt, lt2));

        //periodos maiores de tempo, pelo menos dias
        System.out.println("PERIODOS\n");
        Period p = Period.ofYears(1);
        System.out.println(p);
        Period p2;
        System.out.println((p2=Period.between(LocalDate.of(2020,2,15), LocalDate.of(2025,12,31))));
        System.out.println(p2.toTotalMonths());
    }
}
