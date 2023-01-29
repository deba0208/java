package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Debashis");
        map.put(2, "Navanita");
        map.put(3, "Anirban");
        map.put(4, "Rimpa");
        map.put(5, "Kaushik");
        map.put(null, "Kaushik"); //hashmap also support null index and value
        map.putIfAbsent(5, "sona");
        String r = "123";
        var r1 = r.charAt(0) - '0';
        System.out.println("this is output "+r1);
        var a = map.containsKey(5);//takes O(1) time complexity
        var b = map.containsValue("Kaushi");//takes O(n) time complexity
        var c = map.keySet();
        var d = map.entrySet();

        System.out.println(map);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);

        System.out.println("map.entrySet()");
        for (var items: map.entrySet())
            System.out.print(items+" ");

        System.out.println(" ");

        System.out.println("map.keySet()");
        for (var items: map.keySet())
            System.out.print(items+" ");
    }

}
