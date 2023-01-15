package stack;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var stack = new twoStack(5);

//        stack.push1(10);
//        stack.push1(11);
//        stack.push1(14);
//        stack.push1(15);
//        stack.push2(12);
//        stack.push2(13);
        System.out.println(stack.isFull1());
        System.out.println(stack.isFull2());
//        System.out.println(stack.toString());
    }
}