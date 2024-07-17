package com.tech.multithreading.future;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1,
                1,
                1,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardPolicy()
        );

        Future<?> future = executor.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task is executed :" + Thread.currentThread().getName());
        });

        System.out.println("is done :" + future.isDone());


        try {
            future.get(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (TimeoutException e) {
            System.out.println("TimeOut Exception Caught");
        }

        try {
            future.get();
        } catch (Exception e) {
        }

        System.out.println("is done :" + future.isDone());
        System.out.println("is cancelled: " + future.isCancelled());

        future.cancel(true);

        System.out.println("is cancelled: " + future.isCancelled());


    }
}
