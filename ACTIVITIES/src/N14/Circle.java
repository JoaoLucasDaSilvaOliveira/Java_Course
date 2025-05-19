package N14;

public class Circle implements Shape {
    public Circle(double radius) {
        this.radius = radius;
    }

    private final double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public double surfaceArea() {
        return Math.pow(radius, 2)*Math.PI;
    }
}
