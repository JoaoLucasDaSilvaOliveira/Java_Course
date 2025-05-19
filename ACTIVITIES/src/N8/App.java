package N8;

public class App {
    public static void main(String[] args) {
        Lamp lampada = new Lamp(false);
        lampada.showState();
        lampada.turnOff();
        lampada.turnOn();
        lampada.showState();
        lampada.turnOn();
    }
}
