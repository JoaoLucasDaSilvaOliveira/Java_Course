package N53;

public class App {

    public static void main(String[] args) {
        Matrix<String> matrix = new Matrix<>();
        matrix.setElements(0, 0, "Java");
        matrix.setElements(1, 1, "eh");
        matrix.setElements(2, 2, "TOP");
        matrix.showElements();
    }
}
