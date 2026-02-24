package concurrency.contadorDeThread.semaphore;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class AppSemaphore {

    public static void main(String[] args) {
        Semaphore s = new Semaphore(1);
        CountDownLatch cdl = new CountDownLatch(5);

        List<Thread> threads = Stream.generate(() -> new Thread(new CounterThread(s, cdl))).limit(5).toList();

        threads.forEach(Thread::start);
//        threads.forEach(t -> {
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
        try {
            cdl.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Count: "+ CounterThread.counter);
    }

    private static class CounterThread implements Runnable {
        public static int counter;

        private final Semaphore semaphore;

        private final CountDownLatch cdl;

        public CounterThread(Semaphore semaphore, CountDownLatch cdl) {
            this.semaphore = semaphore;
            this.cdl = cdl;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphore.acquire();
                    counter++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    semaphore.release();
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            cdl.countDown();
        }
    }
}
