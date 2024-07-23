package com.alok.access;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45,"Alok");
        int n = obj.num;
        System.out.println(obj instanceof A);
    }
}
class  SubSubclass extends Subclass{
    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45,"ap");
        int n = obj.num;
    }
}
class Subclass2 extends A {
    public Subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass2 obj = new Subclass2(45,"Alok");
        int n = obj.num;
    }
}
