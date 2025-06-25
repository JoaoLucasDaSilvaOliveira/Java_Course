package _1_DateAndTimeAPI;

import java.time.Instant;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class App7 {
    public static void main(String[] args) {
        //instant
        //instante padrão: EPOCH!
        Instant i = Instant.EPOCH;
        OffsetDateTime lt = OffsetDateTime.of(2020,12,30,12,30,15,0, ZoneOffset.of("Z"));
        OffsetDateTime lt2 = OffsetDateTime.of(1970, 1,1,0,0,0,0,ZoneOffset.of("Z"));
        Instant i2 = lt.toInstant();
        Instant i3 = lt2.toInstant();
        System.out.println(i2.getEpochSecond());
        System.out.println(i3.getEpochSecond());
    }
}
