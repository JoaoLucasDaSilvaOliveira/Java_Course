package concurrency.contadorDeThread;

public class CounterApp {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        t1.start();

        Thread t2 = new Thread(new Counter());
        t2.start();

        Thread t3 = new Thread(new Counter());
        t3.start();

        System.out.println(Thread.currentThread().getName() + "-> End");
    }
}
