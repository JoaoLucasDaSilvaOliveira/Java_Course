package Classes.Exceptions;

public class App {
    public static void main(String[] args) {
        var conta = new Account1("1234-5");
        conta.deposit(500);
        System.out.print(conta);
    }
}
