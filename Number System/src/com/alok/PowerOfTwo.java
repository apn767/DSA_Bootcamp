package com.alok;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 2;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
