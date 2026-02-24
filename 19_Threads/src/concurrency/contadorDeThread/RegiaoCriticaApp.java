package concurrency.contadorDeThread;

import java.util.List;
import java.util.stream.Stream;

public class RegiaoCriticaApp {

    private static final Object MONITOR = new Object();// vai controlar o lock da região critica
    private static int counter = 0;

    public /*syncronized*/ static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 10; i++){
                synchronized (MONITOR){ // garante que apenas uma thread de cada vez tenha acesso à região crítica
                    counter++;
                }
                sleep(10);
            }
        };
        List<Thread> threads = Stream
                                .generate(() -> new Thread(r))
                                .limit(3)
                                .toList();

        threads.forEach(Thread::start);
        threads.forEach(RegiaoCriticaApp::join);

        System.out.println(counter);
    }

    private static void join (Thread t){
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sleep (long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
