package Classes.Exceptions;

public class InsuficientFundsException extends Exception {
    //criando uma Exception
    //podemos ter atributos e metodos
    private final double currentBalance;

  public double getCurrentBalance() {
    return currentBalance;
  }

  public InsuficientFundsException (double currentBalance){
      super("There is no enough funds to withdraw");
      this.currentBalance = currentBalance;
    }
}
