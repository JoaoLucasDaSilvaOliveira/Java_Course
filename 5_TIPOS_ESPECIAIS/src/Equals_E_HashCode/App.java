package Equals_E_HashCode;

public class App {
    public static void main(String[] args) {
        var p = new Pessoa("Joao", 21);
        var p2 = new Pessoa("Joao", 21);
//        System.out.println(p.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p2.hashCode() == p.hashCode());
//        System.out.println(p.equals(p2));
        System.out.println(p.nome);
        System.out.println(p2.nome);

    }
}
