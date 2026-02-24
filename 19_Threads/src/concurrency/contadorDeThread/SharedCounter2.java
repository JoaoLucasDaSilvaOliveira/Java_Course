package concurrency.contadorDeThread;

public class SharedCounter2 implements Runnable {

    private int counter;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            counter++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}