package com.alok;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.print(n);
           return;
        }
        System.out.println(n);
        print(n+1);
    }
}
