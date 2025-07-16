package _2_UsosPraticosdaAPI;

import java.time.DayOfWeek;

public class App2 {
    public static void main(String[] args) {
        //dias da semana
        DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(monday);
        System.out.println(monday.getValue());
        DayOfWeek outroDia = DayOfWeek.of(6);
        System.out.println(outroDia);
        //somar dias
        DayOfWeek plus = outroDia.plus(1);
        DayOfWeek minus = outroDia.minus(10);
        System.out.println(plus);
        System.out.println(minus);
    }
}
