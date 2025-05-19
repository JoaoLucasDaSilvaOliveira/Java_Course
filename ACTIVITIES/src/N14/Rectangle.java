package N14;

public class Rectangle implements Shape{

    public Rectangle (double width, double height){
        this.height = height;
        this.width = width;
    }

    private final double width;
    private final double height;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double surfaceArea() {
        return width*height;
    }
}
