package dsa.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(2);
//        Future<Integer> submit = ex.submit(() -> 1 + 2);
//        Integer i = submit.get();
//        System.out.println("Sum : " + i);
//        ex.shutdown();
//        Thread.sleep(1);
//        System.out.println(ex.isTerminated());


        Callable<Integer> callable1 = () -> {
            System.out.println("task1");
            return 1;
        };

        Callable<Integer> callable2 = () -> {
            System.out.println("task2");
            return 2;
        };

        Callable<Integer> callable3 = () -> {
            System.out.println("task3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        List<Future<Integer>> futures = ex.invokeAll(list);

        for (Future f: futures){
            System.out.println(f.get());
        }

        ex.shutdown();

        System.out.println("task completed");
    }
}
