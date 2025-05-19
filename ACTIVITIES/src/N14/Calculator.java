package N14;

public class Calculator {
    private static double total;

    public double getTotal() {
        return total;
    }
    public void sumSurfaceArean (Shape s){
        total+=s.surfaceArea();
    }
}
