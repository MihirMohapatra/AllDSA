package dsa.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintNumberAndLatter {
    // 1 A 2 B 3 C

private static final Object lock = new Object();
private static boolean numberTurn = true;
    public static void main(String[] args) {
        Runnable printNumber = () -> {
            for (int i = 1; i <= 26 ; i++) {
                synchronized (lock){
                    while (!numberTurn){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(i + " ");
                    numberTurn = false;
                    lock.notify();
                }
            }
        };

        Runnable printLatter = () -> {
            for (char i = 'A'; i <= 'Z' ; i++) {
                synchronized (lock){
                    while (numberTurn){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(i + " ");
                    numberTurn = true;
                    lock.notify();
                }
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(printNumber);
        executor.submit(printLatter);

        executor.shutdown();
    }


}
