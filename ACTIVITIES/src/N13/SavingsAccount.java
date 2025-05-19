package N13;

public class SavingsAccount extends Account{

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double rate() {
        return 0.05;
    }
}
