package com.alok.theory;

public class StackMain {
    public static void main(String[] args) throws Exception{
//        CustomStack stack = new CustomStack(5);
//        stack.push(2);
//        stack.push(45);
//        stack.push(12);
//        stack.push(40);
//        stack.push(6);
//        stack.push(60);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        DynamicStack stack = new DynamicStack(5);
        stack.push(2);
        stack.push(45);
        stack.push(12);
        stack.push(40);
        stack.push(6);
        stack.push(60);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
