package Classes.Mod_Static;

public class IdGeneratedAccount {
    //assunto da aula 01 - construtores
        public IdGeneratedAccount(String accountOwner, double balance){
            this.accountNumber = "000"+currentId++;
            this.accountOwner = accountOwner;
            this.balance = balance;
        }
    //assunto aula 02 - construtores chamando outros construtores
        //orientação: cria-se um construtor genérico contendo a maioria das informações e usamos ele nos outros construtores menores
        public IdGeneratedAccount(String accountOwner){
            //chamando construtor - tem que ser a primeira chamada/ação
            this(accountOwner, 0.0);
        }

    //aula 03 - modificador final
        //obs.: atributos marcados como final, SEMPRE precisam ser inicializados e TODOS os construtores existentes, não pode ter nenhum construtor que não inicie o final;
        private final String accountNumber;
        private final String accountOwner;
        private double balance;
        private static int currentId;

    //static blocks - usamos para inicializar atributos statics, como se fosse construtores (mas não são!!)
        //colocamos a lógica de current id para cá!
        //executa na primeira vez que a classe é acessada, e executa apenas uma vez
        static {
            System.out.println("Inicializando currentId!");
            currentId = 1;
        }
    //constantes
        //obs colocamos com letras maiúsculas, mod final e static e inicializamos na criação do atributo
        //pode ser private ou public sem problemas, pois mesmo que consiga acessar, constantes nunca mudam
        public static final String NOME_PROGRAMADOR = "João Lucas";
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

    //métodos estáticos - funcionária sem o static
    public static int getCurrentId() {
        return currentId;
    }
}
