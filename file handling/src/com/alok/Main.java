package com.alok;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        try(InputStreamReader isr = new InputStreamReader(System.in)){
//            System.out.println("Enter some letters: ");
//            int letters= isr.read();
//            while (isr.ready()){
//                System.out.println((char)letters);
//                letters = isr.read();
//            }
////            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(FileReader fr = new FileReader("note.txt")){
//            System.out.println("Enter some letters: ");
//            int letters= fr.read();
//            while (fr.ready()){
//                System.out.println((char)letters);
//                letters = fr.read();
//            }
////            isr.close();
//            System.out.println();
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            System.out.println("You typed: " + br.readLine());
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//
//        try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {
//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
//        }catch(IOException e){
//                System.out.println(e.getMessage());
//            }
        OutputStream os = System.out;
//        os.write(🙂);
        System.out.println(os);
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello world");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
//            osw.write(🙂);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try (FileWriter fw = new FileWriter("note.txt",(true))){
            fw.append("hello world");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){
            bw.write("hare krishna");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            File fo  = new File("new-file.txt");
            fo.createNewFile();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try {
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("hare krishna");
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch(IOException e){
                System.out.println(e.getMessage());
            }
    }
}
