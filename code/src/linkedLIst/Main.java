package linkedLIst;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedLIst();

        list.addLast(11);//0
        list.addLast(12);//1
        list.addLast(13);//2
        list.addLast(14);//3
        list.addLast(15);//4

        System.out.println(Arrays.toString(list.toArray()));
    }
}
