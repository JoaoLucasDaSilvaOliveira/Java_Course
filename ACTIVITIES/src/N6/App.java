package N6;

public class App {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.set(4,2);
        f2.set(4,2);
        Fraction result = f1.multiplication(f2.numerador, f2.denominador);
        System.out.println(result.numerador+"""
                           
                           ----
                           """+ result.denominador);
    }
}
