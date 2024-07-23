package com.alok;

public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(7);
        System.out.println(ans);
    }
    static int factorial(int n){
        if (n <= 1){
           return 1;
        }
            return   n* factorial(n-1);
    }
}
