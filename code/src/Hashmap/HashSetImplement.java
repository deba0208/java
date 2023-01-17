package Hashmap;

import java.util.Set;

public class HashSetImplement {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.HashSet<>();

        int[] array = {1,2,3,4,2,5,3,1};
        for (int item :
                array) {
            set.add(item);
        }

        System.out.println(set);
    }
}
