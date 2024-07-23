package com.alok.Triangle;

import java.util.Arrays;

public class Triangle1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 1};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void trianle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            System.out.print("* ");
            trianle(r, c + 1);
        } else {

            System.out.println();
            trianle(r - 1, 0);
        }
    }

    static void trianle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            trianle2(r, c + 1);
            System.out.print("* ");

        } else {
            trianle2(r - 1, 0);
            System.out.println();
        }
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        } else {
            bubble(arr, r - 1, 0);
        }
    }

    static void selection(int[]arr,int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
           selection(arr,r - 1, 0,0);
        }
    }
}
