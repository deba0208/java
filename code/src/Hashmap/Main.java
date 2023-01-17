package Hashmap;

public class Main {
    public static void main(String[] args) {

        var find = new CharFinder("green apple");

        var ans = find.findFirstChar();
        var ans1 = find.finFirstRepeatedChar();

        System.out.println(ans);
        System.out.println(ans1);
    }
}
