package N20;

public class App {
    public static void main(String[] args) {
        Operation soma = Operation.SUM;
        System.out.println(soma);
        double res = soma.calculate(10, 20);
        System.out.println(res);
    }
}
