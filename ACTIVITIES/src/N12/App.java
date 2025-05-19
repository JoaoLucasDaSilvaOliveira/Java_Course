package N12;

public class App {
    public static void main(String[] args) {
        var log1 = new LoginStringEspecifica();
        var log2 = new LoginStringsIguais();
        var log3 = new LoginStringEspecifica("Gerente", "Gerente");

        System.out.println(log1.login("João", "1234-5"));
        System.out.println(log2.login("João", "1234-5"));
        System.out.println(log1.login("Admin", "1234-5"));
        System.out.println(log2.login("1234-5", "1234-5"));
        System.out.print(log3.login("Gerente", "Gerente"));
    }
}
