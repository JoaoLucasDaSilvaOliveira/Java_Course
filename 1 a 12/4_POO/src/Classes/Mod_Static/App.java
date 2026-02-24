package Classes.Mod_Static;

public class App {
    public static void main(String[] args) {
        var conta  = new IdGeneratedAccount("João");
        var conta2  = new IdGeneratedAccount("Pedro");
        System.out.println(conta.getAccountNumber());
        System.out.println(conta2.getAccountNumber());
    }
}
