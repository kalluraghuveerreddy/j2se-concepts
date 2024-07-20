package com.tech.collectionapi;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new ArrayDeque<>();
        queue.offer("Raghu");
        queue.offer("Sravya");
        //queue.offer(null);

        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println(queue);
    }
}
