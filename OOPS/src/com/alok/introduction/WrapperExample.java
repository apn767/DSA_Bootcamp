package com.alok.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);
        final  int BONUS = 2;
//        BONUS = 3;cannot be modified
      final  A alok = new A("Alok Pandey");
      alok.name = "other";
//      alok = new A("new Object");
        A obj = new A("tajklfdk");
        System.out.println(obj);
//        for (int i = 0; i<100000000;i++){
//            obj = new A("Random name");
//        }
    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A{
    final int num = 10;
    String name;
    public A(String name){
      this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
