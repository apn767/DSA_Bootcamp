package com.alok;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID) {
            case 1 -> System.out.println("Alok pandey");
            case 2 -> {
                System.out.println("Amartya Gupta");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                }
            }
            default -> System.out.println("enter correct employee ID");
        }
    }
}
