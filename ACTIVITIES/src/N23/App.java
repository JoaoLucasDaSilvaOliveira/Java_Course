package N23;

public class App {
    public static void main(String[] args) {
        Item relogio = new Item(15999.99, "Este é um Patek Philippe", "USD");
        Item carro = new Item(150750.00, "Este é uma BWM 220i", "BRL");
        Item moto = new Item(3000.00, "Este é uma Honda CB500", "EUR");

        System.out.println(relogio);
        System.out.println(carro);
        System.out.println(moto);
    }
}
