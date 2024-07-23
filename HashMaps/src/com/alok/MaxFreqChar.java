package com.alok;

import java.util.ArrayList;
import java.util.HashMap;

public class MaxFreqChar {
    public static void main(String[] args) {
        System.out.println(maxFreqCharacter("aabcddebbbf"));
    }
    public static char maxFreqCharacter(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0;i< str.length();i++){
            if (map.containsKey(str.charAt(i))){
                int of = map.get(str.charAt(i));
                int nf = of + 1;
                map.put(str.charAt(i), nf);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        System.out.println(map);
        ArrayList<Character> list = new ArrayList<>(map.keySet());
        char maxChar = ' ';
        int maxFreq = 0;
        for (char ch: list){
            if (map.get(ch) > maxFreq){
             maxFreq = map.get(ch);
             maxChar = ch;
            }
        }
        return maxChar;
    }
}
