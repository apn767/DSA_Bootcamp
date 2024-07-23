package com.alok;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2,5,8,65,4};
        int target = 4;
        System.out.println(linearSearch(arr,target,1,3));
    }
    static int linearSearch(int[] arr, int target, int start , int end){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int index = start; index < end; index++ ){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }return Integer.MAX_VALUE;
    }
}
