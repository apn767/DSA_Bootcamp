package com.alok.theory;

import com.alok.theory.CircularQueue;

public class QueueMain {
    public static void main(String[] args)throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(5);
//        queue.insert(2);
//        queue.insert(4);
//        queue.insert(89);
//        queue.insert(7);
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(2);
        queue.insert(4);
        queue.insert(89);
        queue.insert(8);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(7);
        queue.display();
    }
}
