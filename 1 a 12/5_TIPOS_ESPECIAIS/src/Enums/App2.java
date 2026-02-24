package Enums;

public class App2 {
    public static void main(String[] args) {
        Meses m = Meses.MARCO;
        System.out.println(m.getMonthNum());
        //toString
        System.out.println(m);
        //nome
        System.out.println(m.name());
        //ordem (array indexado)
        System.out.println(m.ordinal());
        //valueOf: usamos quando temos uma string chamando um atributo do enum
        //  caso passe uma string que não ha no enum, lança uma IllegalArgumentException
        Meses m2 = Meses.valueOf("JANEIRO");
        //  caso queira procurar em um enum em específico
        Meses m3 = Enum.valueOf(Meses.class, "JANEIRO");
        System.out.println(m2);
    }
}
