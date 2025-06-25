package _1_DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App3 {
    public static void main(String[] args) {
        //LocalDateTime
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalTime time = LocalTime.of(12,15,30);
        LocalDate date = LocalDate.of(2025,6,16);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime d = LocalDateTime.of(2025,12,30,13,30,0);
        System.out.println(dateTime);
        System.out.println(d);
    }
}
