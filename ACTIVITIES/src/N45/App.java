package N45;

public class App {

    public static void main(String[] args) {
        repeat(()-> System.out.println("Hello user"), 2);
    }

    public static void repeat (CodeRepeater codeRepeater, int times){
        for (int i=0; i<times; i++){
            codeRepeater.code();
        }
    }

    @FunctionalInterface
    public interface CodeRepeater {
        void code();
    }
}
