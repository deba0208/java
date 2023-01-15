package Queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var queue = new circularQueue(5);

        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        int value = queue.dequeue();
        int value2 = queue.dequeue();

//        queue.enqueue(15);
//        queue.enqueue(16);

        System.out.println(queue.toString());
    }

}
