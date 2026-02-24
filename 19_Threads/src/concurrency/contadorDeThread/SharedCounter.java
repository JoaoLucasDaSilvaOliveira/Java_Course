package concurrency.contadorDeThread;

public class SharedCounter implements Runnable {

    private int i;

    @Override
    public void run() {
        while (i < 10){
            System.out.format("%s -> %d\n", Thread.currentThread().getName(), i);
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}