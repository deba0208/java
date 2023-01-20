package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        var map = new HashSetImplement();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(8, "d");
        map.put(6, "e");
        map1.put(7, "t");

        map.remove(36);

        System.out.println("");
    }
}