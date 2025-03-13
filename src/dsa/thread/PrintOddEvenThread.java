package dsa.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintOddEvenThread {
    private static final Object lock = new Object();
    private static int count =1;
    public static void main(String[] args) {

        Runnable oddPrint = () -> {
            while (count <=20){
                synchronized (lock){
                    if(count % 2 != 0){
                        System.out.println("Odd: " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        Runnable evenPrint = () -> {
            while (count <=20){
                synchronized (lock){
                    if(count % 2 == 0){
                        System.out.println("even: " + count);
                        count++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(oddPrint);
        executor.submit(evenPrint);

        executor.shutdown();


    }
}
