package com.alok.access;

public class ObjectDemo {
    int num;
  float gpa;
    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(2,57.022f);
        ObjectDemo obj2 =new ObjectDemo(2,57.022f);
        if (obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
        System.out.println(obj.getClass().getName());
    }

}
