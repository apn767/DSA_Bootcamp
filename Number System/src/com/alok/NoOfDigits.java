package com.alok;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 45453;
        int b = 8;
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
