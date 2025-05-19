package Classes.Herança;

import Classes.Basic.Account;

import java.util.Objects;

public class Accounty extends Account {
    public Accounty(String accountOwner, String accountNumber, double rate) {
        super(0.0, accountOwner, accountNumber);
        this.rate = rate;
    }

    static int teste;

    private double rate;

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //sobrescrevendo metodos
    //override só funciona se usarmos os mesmos parâmetros da classe pai
    @Override
    public void printBalance() {
        //chamando o printBalance da classe pai
        super.printBalance();
        System.out.println("Rate: " + this.rate);
    }

}
