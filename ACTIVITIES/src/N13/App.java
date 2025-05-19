package N13;

public class App {
    public static void main(String[] args) {
        CheckingAccount conta = new CheckingAccount(0.01);
        System.out.println(conta.getBalance());
        conta.updateBalance();
        System.out.println(conta.getBalance());
        conta.updateBalance();
        System.out.println(conta.getBalance());
        SavingsAccount conta2 = new SavingsAccount(1000);
        conta2.updateBalance();
        System.out.println(conta2.getBalance());
        conta2.updateBalance();
        System.out.println(conta2.getBalance());


    }
}
