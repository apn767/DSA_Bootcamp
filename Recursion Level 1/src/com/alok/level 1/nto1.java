package com.alok;

public class nto1 {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.print(n + " ");
        fun(n-1);

    }
}
