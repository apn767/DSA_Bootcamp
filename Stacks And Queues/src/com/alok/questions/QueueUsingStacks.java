package com.alok.questions;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.pop());
    }
}
class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item) throws Exception{
//        first.push(item);
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while (second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove() throws Exception{
//        while (!first.isEmpty()){
//            second.push(first.pop());
//        }
//        int removed = second.pop();
//        while (!second.isEmpty()){
//            first.push(second.pop());
//        }return removed;
        return first.pop();
    }
    public int peek()throws Exception{
//        while (!first.isEmpty()){
//            second.push(first.pop());
//        }
//        int peeked = second.peek();
//        while (!second.isEmpty()){
//            first.push(second.pop());
//        }return peeked;
        return first.peek();
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
