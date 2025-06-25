package N37;

import java.time.*;

public class App {
    public static void main(String[] args) {
        System.out.println(calculaVencimento(1));
    }
    public static LocalDateTime calculaVencimento (int hours){
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(OffsetDateTime.now().toInstant().getEpochSecond() + (hours*60L)*60), ZoneId.of("America/Sao_Paulo"));
    }
}
