package _1_DateAndTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App2 {
    public static void main(String[] args) {
        //LocalTime
        LocalTime time = LocalTime.now();
        LocalTime time1 =LocalTime.of(12,0,15);
        LocalTime time2 = time1.withHour(13).withNano(12351684);
        LocalTime time3 = LocalTime.parse("00:00:00");
        LocalTime time4 = LocalTime.parse("15.03.01", DateTimeFormatter.ofPattern("HH.mm.ss"));
        LocalTime time5 = time4.plusHours(10);
        String timeStr = time5.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(time);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(time5);
        System.out.println(timeStr);
    }
}
