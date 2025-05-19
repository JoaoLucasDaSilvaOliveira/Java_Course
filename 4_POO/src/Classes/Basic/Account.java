package Classes.Basic;

public class Account {
    public Account(double balance, String accountOwner, String accountNumber) {
        this.balance = balance;
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
    }

    //since aula 01
        protected String accountNumber;

    //since aula 02
        protected String accountOwner;
        protected double balance;

    //since aula 03 (métodos)
    public void printBalance(){
        System.out.println(accountNumber+" Balance: R$"+balance);
    }
    boolean deposit (double value){
        if (value > 0){
            balance+=value;
            return true;
        }
        return false;
    }
    boolean withdraw (double value){
        if (value > 0 && value <= balance) {
            balance-=value;
            return true;
        }
        return false;
    }
    boolean transfer(Account ac, double value){
        if (ac.deposit(value) && this.withdraw(value)){
            return true;
        }
        return false;
    }

    //since aula 04 (sobrecarga de métodos)
    boolean deposit (String str){
        return deposit(Double.parseDouble(str));
    }
}
