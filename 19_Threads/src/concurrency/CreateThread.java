package concurrency;

public class CreateThread {

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        Thread mt2 = new Thread(new MyThread2());
        mt2.start();

        new Thread(()-> System.out.println("Hello world")).start();

        System.out.println("Main");
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("My thread here!");
        }
    }
    static class MyThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("My thread2 here!");
        }
    }
}
