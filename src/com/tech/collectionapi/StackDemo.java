package com.tech.collectionapi;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        System.out.println(stack.push("Raghu"));
        System.out.println(stack.push("Sravya"));
        System.out.println(stack.peek());
        //System.out.println(stack.pop());
        System.out.println(stack.search("Sravya"));
        System.out.println(stack);
    }
}
