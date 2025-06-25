package N36;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento no formato mm/dd/aaaa: ");
        String resp = scanner.nextLine();
        LocalDate dataNasc = LocalDate.parse(resp, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Period d = Period.between(dataNasc, LocalDate.now());
        System.out.println("Anos: "+d.getYears()+"\nMeses: "+d.getMonths()+"\nDias: "+d.getDays());
    }
}
