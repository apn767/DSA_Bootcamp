package com.alok.introduction;


public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];
        Student[] student = new Student[5];
        Student alok = new Student(20,"Alok",52.021f);
        System.out.println(alok.marks);
        System.out.println(alok.names);
        System.out.println(alok.numbers);
        Student random = new Student(alok);
        System.out.println(random.names);
        Student random2 = new Student();
        System.out.println(random2.names);
        Student one = new Student();
        Student two = one;
        one.names = "Someone";
        System.out.println(two.names);

//        alok.changeName("Amartya");
//        alok.greeting();
    }
}

   class Student{
        int numbers;
        String names;
        float marks;
        void changeName(String newName){
names = newName;
       }
        void greeting(){
            System.out.println("Hello kdfgh " + this.names);
        }
        Student (Student other){
            this.numbers = other.numbers;
            this.marks = other.marks;
            this.names = other.names;
        }
        Student(){
            this(20,"default person", 100.0f);
//            this.numbers = 20;
//            this.marks = 65.456456f;
//            this.names = "Alok Pandey";
      }
      Student(int rnumbers, String name, float mark){
           numbers =rnumbers;
           marks = mark;
           names = name;
      }
 }

