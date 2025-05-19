package N14;

public class App {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        Square quadrado = new Square(10);
        calculadora.sumSurfaceArean(quadrado);
        System.out.println(quadrado.getWidth());
    }
}
