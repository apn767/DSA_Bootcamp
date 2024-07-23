package com.alok;

public class Check_Pair_Mod_K {
    public static void main(String[] args) {
        int[] arr = {20,25,10,3,15,27};
        System.out.println(canMakePairs(arr,10));
    }
    private static boolean canMakePairs(int[] arr, int k){
        int[] freq = new int[k];
        for(int num: arr){
            num = num % k;
            if (num < 0) num += k;
            freq[num]++;
        }
        if (freq[0] % 2 != 0) return false;
        for (int i = 1;i <= k/2;i++){
            if (freq[i] != freq[k-i]) return false;
        }
        return true;
    }
}
