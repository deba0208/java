package Queues;

import java.util.Arrays;

public class queuesLL {

    private Node front;
    private Node back;

    private int count;

    private int length;

    public queuesLL(int length){
        this.length = length;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void enqueues(int item){

        if(isFull()){
            throw new IllegalStateException();
        }
        var node = new Node(item);
        if(front == null && back == null){
            front = back = node;
            count++;
            return;
        }
        back.next = node;
        back = node;
        count++;
    }

    public int dequeues(){
        if(isEmpty())
            throw new IllegalArgumentException();

        if (front.next == null) {
            int value = front.value;
            front = back = null;
            count--;

            return value;
        }

        int value = front.value;
        var current = front.next;
        front.next = null;
        front = current;
        count--;

        return value;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean isFull(){
        return count == length;
    }

    public int peek(){
        return front.value;
    }
    public int[] toArray(){
        int[] array = new int[count];
        var current = front;

        for (int i = 0; i < count; i++) {
            array[i] = current.value;;
            current = current.next;
        }

        return array;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(toArray(), 0, count);
        return Arrays.toString(content);
    }
}
