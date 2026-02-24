package Classes.Construtores;

public class App {
    public static void main(String[] args) {
        EncapsulatedAccount ac1 = new EncapsulatedAccount("1234-5", "Pedro");
        EncapsulatedAccount ac2 = new EncapsulatedAccount("4567-8", "João", 1500.00);
        EncapsulatedAccount ac3 = new EncapsulatedAccount("Pedro", 1000.00);
    }
}
