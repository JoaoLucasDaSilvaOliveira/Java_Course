package N44;

public class App {

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running");
            }
        };
        doIt(runnable);
    }

    private static void doIt (Runnable instance){
        instance.run();
    }
}
