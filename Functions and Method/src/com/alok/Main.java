package com.alok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i=0;i<=10;i++){
            System.out.println("Enter first number: ");
            int num1 = in.nextInt();
            System.out.println("Enter second number");
            int num2 = in.nextInt();
            int ans = num1 + num2;
            System.out.println("The sum is: "+ans);
        }
    }
}
