package com.alok;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isPrime(n));

        for (int i = 100; i<1000;i++){
            if (armstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean armstrong(int a){

            int original = a;
            int sum = 0;
        while (a>0){
            int rem = a % 10;
            a /= 10;
            sum += rem*rem*rem;
        }return sum == original;
    }
    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;

        }

    }

