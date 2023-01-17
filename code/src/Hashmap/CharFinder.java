package Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    private String str;

    public CharFinder(String str) {
        this.str = str;
    }

    public char findFirstChar() {
        Map<Character, Integer> map = new HashMap<>();
        /*for (var ch : str.toCharArray()) {
            if(map.containsKey(ch)){
                var count = map.get(ch);
                map.put(ch, ++count);
            }else
                map.put(ch, 1);
        }*/
        var chars = str.toCharArray();
        for ( char ch : chars){
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, ++count);
        }
        for ( char ch : chars) {
            if(map.get(ch) == 1)
                return ch;
        }
        return 0;
    }

    public char finFirstRepeatedChar() {
        Set<Character> set = new HashSet<>();

        for (var item :
                str.toCharArray()) {
            if (set.contains(item))
                return item;

            set.add(item);
        }

        return Character.MIN_VALUE;
    }
}