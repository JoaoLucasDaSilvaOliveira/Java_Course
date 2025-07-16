package _3_APiLegadoDeDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App3 {
    public static void main(String[] args) throws ParseException {
        //formatando datas
        Calendar k = Calendar.getInstance();
        k.set(2000, Calendar.APRIL, 10,12,15,30);

        System.out.println(k.getTime());

        //formato
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(k.getTime()));

        //parse
        Date d2 = sdf.parse("15/05/2025 12:00:00");
        System.out.println(d2);
    }
}
