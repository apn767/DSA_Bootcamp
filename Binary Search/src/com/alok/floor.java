package com.alok;

public class floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floorOf(arr,target);
        System.out.println(ans);
    }
    static int floorOf(int[] arr, int target){
        if (target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end-start)/ 2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }return arr[end];
//    static int floorOf(int[] arr, int target){
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end){
//            int mid = start + (end - start)/2;
//            if (arr[mid]< target){
//                if (arr[mid +1] > target){
//                    return arr[mid];
//                }
//                start = mid + 1;
//            }if (arr[mid] == target){
//                return arr[mid -1];
//            }if (arr[mid] > target){
//                if (arr[mid -1] < target){
//                    return arr[mid -1];
//                }
//                end = mid -1;
//            }
//        }
//        return arr[end];
    }
}
