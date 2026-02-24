package Classes.Exceptions;

public class Account3 {
    //resolvendo com Exceptions e RunTimeExceptions
    //RunTime são uncheckeds, então não precisa declarar que o erro pode acontecer, é algo imprevisto
    //Exception são checkeds, então precisa declarar que o erro pode acontecer, é algo dentro do esperado e precisa ser tratado
    //ambas as exceções brekam o código, entretanto a Exeptions precisam ser tratas antes da Compilação, ou seja,
        //Exeptions não deixam compilar sem propagar o erro ou fazer um try/catch

    private final String number;
    private double balance;

    public Account3(String number){
        this.number = number;
    }

    public void deposit (double amount){
        this.balance+=amount;
    }

    //como temos uma Exception, precisamos propagar o erro para que quem for utilizar o metodo a trate
    //                                         |
    //                                        V
    public void withdraw (double amount) throws InsuficientFundsException{
        if (amount < 0 ){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if (amount > balance){
            throw new InsuficientFundsException (balance);
        }
            this.balance-=amount;
    }

    @Override
    public String toString() {
        return """
               Account1 {
                            number= '%s',
                            balance= '%s'
                        }""".formatted(number, balance);
    }
}
