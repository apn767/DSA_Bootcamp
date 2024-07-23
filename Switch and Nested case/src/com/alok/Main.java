package com.alok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a num: ");
//        String fruit = in.next();
//        if (fruit.equals("mango")){
//            System.out.println(fruit);
//        }else {
//            System.out.println("invalid");
//        }
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Banana" -> System.out.println("a yello fruit");
//            case "Orange" -> System.out.println(" Round fruit");
//            default -> System.out.println("Please enter a valid fruit name");
//        }
        int day = in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter a valid day");
//        }
        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
        System.out.println("\"Hello\"");
    }
}
