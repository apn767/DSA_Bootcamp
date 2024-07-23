package com.alok;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> languages = new HashMap<>();
        languages.put("Java", 20);
        languages.put("CPP", 30);
        languages.put("Python", 2);
        languages.put("Java", 10);
        System.out.println(languages);
        System.out.println(languages.get("Java"));
        System.out.println(languages.keySet());
        System.out.println(languages.values());
        System.out.println(languages.entrySet());
        languages.replace("CPP", 20);
        languages.remove("Java");
        System.out.println(languages);
    }
}
