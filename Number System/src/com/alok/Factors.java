package com.alok;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(20);
    }
    static void factors(int n){
        for ( int i = 1; i <= n; i ++){
            if (n % i == 0)
            System.out.print(i + " ");
        }
    }
    static void factors2(int n){
        for ( int i = 1; i <= Math.sqrt(n); i ++){
            if (n % i == 0) {
                if (n/ i == 1){
                    System.out.println(i);
                }else
                System.out.print(i + " " + n / i + " ");
            }
        }
    }
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i = 1; i <= Math.sqrt(n); i ++){
            if (n % i == 0) {
                if (n/ i == 1){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0 ;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
