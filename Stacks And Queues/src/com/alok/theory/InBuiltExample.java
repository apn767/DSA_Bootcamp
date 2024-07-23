package com.alok.theory;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack  = new Stack<>();
//        stack.push(45);
//        stack.push(55);
//        stack.push(41);
//        stack.push(5);
//        stack.push(4);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(6);
//        queue.add(24);
//        queue.add(45);
//        queue.add(0);
//        queue.add(12);
//        queue.add(9);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
          Deque<Integer> deque = new ArrayDeque<>();
          deque.addFirst(52);
          deque.add(5);
          deque.addLast(522);
          deque.removeFirst();
    }
}
