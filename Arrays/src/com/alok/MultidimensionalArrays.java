package com.alok;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
//        int[][] arr = new int[3][5];
//        int[][] arr = {
//                {5,8,6,85,6},
//                {5,8,6},
//                {5,8,8,6},
//        };
//        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        int[][]  arr = new int[3][4];
        System.out.println(arr.length);
        for (int row = 0; row < arr.length;row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
            for (int row = 0; row < arr.length;row++){
//                for (int col = 0; col < arr[row].length; col++){
//                    System.out.print(arr[row][col] + " ");
//            }
//                System.out.println();
        }
            for (int row = 0; row < arr.length;row++){
                System.out.println(Arrays.toString(arr[row]));
        }
            for (int[] a : arr){
                System.out.println(Arrays.toString(a));
            }
            String[] ar = new String[4];
        System.out.println(ar[0]);
        for (String element : ar){
            System.out.print(element);
        }
    }
}
