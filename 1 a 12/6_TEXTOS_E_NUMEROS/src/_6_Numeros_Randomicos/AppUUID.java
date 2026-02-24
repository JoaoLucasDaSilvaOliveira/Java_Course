package _6_Numeros_Randomicos;

import java.util.UUID;

public class AppUUID {
    public static void main(String[] args) {
        //gerando códigos de id únicos
        //UUIDs são códigos gerados de forma aleatória e que são tão extensos que são considerados únicos e impossíveis
        //de replicar aleatóriamente
        UUID id = UUID.randomUUID();
        UUID id2 = UUID.randomUUID();
        System.out.println(id);
        System.out.println(id2);
    }
}
