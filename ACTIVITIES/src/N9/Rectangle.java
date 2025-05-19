package N9;

public class Rectangle {

    public Rectangle (double height, double width){
        if (height > 0 && width > 0){
            this.height = height;
            this.width = width;
        } else {
            this.height = 0;
            this.width = 0;
        }
    }
    public Rectangle (double side){
        this(side, side);
    }

    private final double height;
    private final double width;

    public double square (){
        return (height * width);
    }

}
