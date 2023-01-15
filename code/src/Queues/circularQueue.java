package Queues;

import java.util.Arrays;

public class circularQueue {
    private int[] items;
    private int front;
    private int back;
    private int count;
    public circularQueue(int length){
        items = new int[length];
    }

    public void enqueue(int item){
        if(isFull())
            throw new IllegalStateException();

        items[back] = item;
        back = (back + 1) % items.length;
        count++;
    }

    public int dequeue(){
        if(isEmpty())
            throw new IllegalArgumentException();

        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalArgumentException();

        return items[front];
    }
    public boolean isFull(){
        return count == items.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public String toString(){
        return Arrays.toString(items);
    }
}
