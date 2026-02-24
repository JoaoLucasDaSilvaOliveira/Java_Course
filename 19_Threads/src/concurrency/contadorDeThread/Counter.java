package concurrency.contadorDeThread;

public class Counter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.format("%s -> %d\n", Thread.currentThread().getName(), i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
