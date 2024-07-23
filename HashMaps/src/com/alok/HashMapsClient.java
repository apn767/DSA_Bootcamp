package com.alok;

import java.util.HashMap;

public class HashMapsClient {
    public static void main(String[] args) {
        HashMaps map = new HashMaps();
        map.put("Riya", 20);
        map.display();
        map.put("Alok", 30);
        map.display();

        System.out.println(map.keySet());
    }
}
