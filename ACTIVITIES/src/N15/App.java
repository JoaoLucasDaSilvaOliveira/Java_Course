package N15;

public class App {
    public static void main(String[] args) throws TooFastException{
        Vehicle carro = new Vehicle(1);
        while (true)
        carro.accelerate();

    }
}
