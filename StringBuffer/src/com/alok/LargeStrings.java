package com.alok;

public class LargeStrings {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Alok Pandey");
        StringBuffer sb3 = new StringBuffer(30);
        buffer.append("WeMakeDevs");
        sb2.append(" s nic");
        sb2.append(" s ynic");
        sb2.insert(2," Ap ");
        sb2.replace(1,3,"Hi ");
        sb2.reverse();
        String str = buffer.toString();
        System.out.println(sb2);
    }
}
