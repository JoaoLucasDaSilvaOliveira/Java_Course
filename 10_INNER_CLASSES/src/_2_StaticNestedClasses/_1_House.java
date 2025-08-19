package _2_StaticNestedClasses;

public class _1_House {
    private final String color;
    private final double sizeInSquares;

    public _1_House(String color, double sizeInSquares) {
        this.color = color;
        this.sizeInSquares = sizeInSquares;
    }

    public static class Window {
        private final String color;
        private final String material;

        public Window(String color, String material) {
            this.color = color;
            this.material = material;
        }
    }
}
