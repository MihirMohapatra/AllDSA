package dsa.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPrintOddEven {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService  executorService = Executors.newFixedThreadPool(3);

        Runnable odd = () -> {
            for (int i = 0; i <= 10; i++) {
                if (i%2!=0) System.out.println("Odd: " + i);
            }
        };

        Runnable even = () -> {
            for (int i = 0; i <= 10; i++) {
                if(i % 2 == 0) System.out.println("even: " + i);
            }
        };


       Future<?> oddTask = executorService.submit(odd);
       oddTask.get();
        executorService.submit(even);

        executorService.shutdown();
    }
}
