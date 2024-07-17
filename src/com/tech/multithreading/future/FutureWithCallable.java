package com.tech.multithreading.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureWithCallable {
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
        List<Integer> list = new ArrayList<>();
        Future<List<Integer>> future = executor.submit(() ->
                list.add(100), list);
        try {
            System.out.println(future.get());
        } catch (Exception e) {

        }
    }
}
