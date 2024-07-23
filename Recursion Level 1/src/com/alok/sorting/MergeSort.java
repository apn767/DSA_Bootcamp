package com.alok.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,6};
        int[]ans = merge(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));
    }
    static int[] merge(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid, arr.length));
        return merges(left,right);
    }
    static int[] merges(int[] first, int[] second){
        int[] mix = new int[first.length+ second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
