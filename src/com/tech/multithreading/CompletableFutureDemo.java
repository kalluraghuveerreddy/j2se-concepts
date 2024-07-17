package com.tech.multithreading;

import java.util.concurrent.*;

public class CompletableFutureDemo {
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


        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            return "Task Completed";
        }, executor);
        try {
            System.out.println(stringCompletableFuture.get());
        } catch (Exception e) {

        }

        //chaining using thenApply(), thenApplyAsync()

        CompletableFuture<String> thenApplyChaining = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread Name:" + Thread.currentThread().getName());
            return "Task Completion";
        }, executor).thenApplyAsync((string) -> {
            System.out.println("Thread Name in thenApply():" + Thread.currentThread().getName());
            return " Done";
        },executor);
        try {
            System.out.println(thenApplyChaining.get());
        } catch (Exception e) {

        }
    }
}
