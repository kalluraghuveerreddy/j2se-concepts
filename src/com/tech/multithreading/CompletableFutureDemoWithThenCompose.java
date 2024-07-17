package com.tech.multithreading;

import java.util.concurrent.*;

public class CompletableFutureDemoWithThenCompose {
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


        //chaining using thenCompose(), thenComposeAsync()

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread Name:" + Thread.currentThread().getName());
            return "Hello";
        }, executor);

        CompletableFuture<String> completableFuture1 = completableFuture.thenCompose((String val) -> {
            return CompletableFuture.supplyAsync(() -> val + " World");
        });

        try {
            System.out.println(completableFuture1.get());
        } catch (Exception e) {

        }
    }
}
