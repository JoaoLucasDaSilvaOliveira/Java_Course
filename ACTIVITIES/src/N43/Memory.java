package N43;

public class Memory {

    public static Stats stats (){
        return new Stats();
    }

    public static class Stats {
        private final Runtime runtime = Runtime.getRuntime();

        @Override
        public String toString (){
            return String.format("Memória Livre: %d bytes\nMemória Ocupada: %d bytes\nMemória Total: %d bytes", runtime.freeMemory(), runtime.totalMemory()- runtime.freeMemory(), runtime.totalMemory());
        }
    }
}
