package com.alok;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,56,455};
        System.out.println(search(arr,45,0,arr.length -1));;
    }
    static int search(int[] arr, int target, int start,int end){
            if (start > end){
                return -1;
            }
            int mid = start + (end - start) /2;
            if (arr[mid] == target){
                return mid;
            }
            if (target < arr[mid] ){
                return search(arr, target,start, mid -1);
            }else{
               return search(arr, target, mid +1, end);
            }
    }
}
