package com.alok.enumExample;

public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello how are you");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));
//        for (Week day: Week.values()){
//            System.out.println(week.ordinal());
//        }
    }
}
