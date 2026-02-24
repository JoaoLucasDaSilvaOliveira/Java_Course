package _3_APiLegadoDeDatas;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        //classes legadas - objs são mutáveis
        Date date = new Date();
        System.out.println(date.getTime());

        Calendar cal = Calendar.getInstance();
        //janeiro eh mês 0!
        cal.set(2020, Calendar.MARCH, 10, 14, 30, 20);
        cal.add(Calendar.YEAR, 2);
        System.out.println(cal.getTime());
    }
}
