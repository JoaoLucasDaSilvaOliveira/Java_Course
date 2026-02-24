package Classes.Exceptions;

public class Account2 {
    //tentando resolver erros com mágic number (não usar!!!)

    private final String number;
    private double balance;

        public Account2(String number){
            this.number = number;
        }

        public void deposit (double amount){
            this.balance+=amount;
        }

    /***
     *
     * @param amount
     * @Returns:
     *      1 = tudo ok;
     *      -1 saque com valor negativo
     *      -2 saque com valor maior que o saldo
     */
    public int withdraw (double amount){
            if (amount < 0 ){
                return -1;
            }
            if (amount < balance){
                this.balance-=amount;
                return 1;
            }
            return -2;
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
