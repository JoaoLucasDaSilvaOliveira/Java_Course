package N15;

public class Vehicle {

    public Vehicle (int speed){
        if (speed < 0){
            throw new IllegalArgumentException("A velocidade não pode ser negativa!");
        }
        this.speed = speed;

    }

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void accelerate() throws TooFastException     {
        if (speed * 2 > 200){
            throw new TooFastException("Veículo acima de 200 km/h");
        }
        speed*=2;
        System.out.println(getSpeed());
    }

}
