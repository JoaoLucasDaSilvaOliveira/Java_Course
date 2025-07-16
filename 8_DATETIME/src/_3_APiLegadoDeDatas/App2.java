package _3_APiLegadoDeDatas;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class App2 {
    public static void main(String[] args) {
        //ponte entre a API legado e a nova API
        Date d = new Date();
        Calendar k = Calendar.getInstance();
        Instant i = d.toInstant();
        System.out.println(i);
        d = Date.from(i.plus(1, ChronoUnit.DAYS));
        k.setTime(d);
        System.out.println(k.getTime());
    }
}
