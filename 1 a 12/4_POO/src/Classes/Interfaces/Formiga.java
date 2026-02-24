package Classes.Interfaces;

public class Formiga implements Walkable{
    private int totalDistance = 100;

    @Override
    public void walk() {
        totalDistance-=10;
    }

    @Override
    public void stop() {
        totalDistance = 100;
    }
}
