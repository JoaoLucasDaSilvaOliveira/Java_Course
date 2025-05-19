package N13;

public abstract class Account {

    public Account (double balance){
        this.balance = balance;
    }

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void updateBalance (){
        balance+= balance*rate();
    }

    abstract double rate ();
}
