package com.alok;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println(random.nextFloat());
//        System.out.println((char)(97 + 1));
        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        String sentence = "HI h hkjdkfh jildfh hfid";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));
        String arr = "Alok Amartya Abhishek Sanjeet Aditya";
        String[] names = arr.split("a");
        System.out.println(Arrays.toString(names));
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}
