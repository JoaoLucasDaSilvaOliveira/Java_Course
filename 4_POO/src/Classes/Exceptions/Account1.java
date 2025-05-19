package Classes.Exceptions;

public class Account1 {

    private final String number;
    private double balance;

        public Account1(String number){
            this.number = number;
        }

        public void deposit (double amount){
            this.balance+=amount;
        }
        public void withdraw (double amount){
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
