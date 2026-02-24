package concurrency.contadorDeThread;

public class SharedCounterApp {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter c = new SharedCounter();
        Thread t1 = new Thread(c);
        t1.start();

        Thread t2 = new Thread(c);
        t2.start();

        t1.join();
        t2.join();

        System.out.println("END");
    }
}
