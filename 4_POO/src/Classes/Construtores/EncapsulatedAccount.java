package Classes.Construtores;

public class EncapsulatedAccount {
    //assunto da aula 01 - construtores
        public EncapsulatedAccount (String accountNumber, String accountOwner, double balance){
            this.accountNumber = accountNumber;
            this.accountOwner = accountOwner;
            this.balance = balance;
        }
        public EncapsulatedAccount (String accountNumber, String accountOwner){
            this.accountNumber = accountNumber;
            this.accountOwner = accountOwner;
        }
    //assunto aula 02 - construtores chamando outros construtores
        //orientação: cria-se um construtor genérico contendo a maioria das informações e usamos ele nos outros construtores menores
        public EncapsulatedAccount (String accountOwner, double balance){
            //chamando construtor - tem que ser a primeira chamada/ação
            this(null, accountOwner, balance);
        }

    //aula 03 - modificador final
        //obs.: atributos marcados como final, SEMPRE precisam ser inicializados e TODOS os construtores existentes, não pode ter nenhum construtor que não inicie o final;
        private final String accountNumber;
        private final String accountOwner;
        private double balance;

    //alt+insert para fazer getters e setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    /* deixam de existir a partir da aula 03 - modificador final
    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
