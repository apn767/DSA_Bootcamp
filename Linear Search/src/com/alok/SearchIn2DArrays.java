package com.alok;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {78,4,6},
                {4,5,8,15},
                {78,99,5,65},
                {18,12}
        };
        System.out.println(max(arr));
    }

   static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max){
                  max = arr[i][j];
                }
            }
        }     return max;
    }
}
