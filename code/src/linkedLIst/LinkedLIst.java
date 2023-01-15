package linkedLIst;

import java.util.NoSuchElementException;

public class LinkedLIst {
    private Node first;
    private Node last;
    private int size;
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addLast(int item){
        var node = new Node(item);

        if(isEmpty()) first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if(isEmpty()) first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void removeFirst() {
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;
        }else{
            var node = first.next;
            first.next = null;
            first = node;
        }
        size--;
    }

    public int indexOf(int item){
        int index = 0;
        var node = first;

        while(node != last){
            if(node.value == item)return index;
            index++;
            node = node.next;
        }

        return -1;
    }

    public boolean contain(int item) {
        return indexOf(item) != -1;
    }

    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last){
            first = last = null;

        }else{
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;
    }

    public int size(){
        return size;
    }

    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node)return current;
            else current = current.next;
        }
        return null;
    }

    public void middle(){
        var a = first;
        var b = first;
        while(b != last && b.next != last){
            b = b.next.next;
            a = a.next;
        }

        if(b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value+" "+a.next.value);
    }

    public int[] toArray(){
        var array = new int[size];
        var current = first;

        for (int i = 0; current != null; i++) {
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }
    private boolean isEmpty(){
        return first == null;
    }
    public void print(){
        var current = first;

        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}
