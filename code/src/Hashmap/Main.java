package Hashmap;

public class Main {
    public static void main(String[] args) {
        String str = "a green apple";
        var find = new CharFinder(str);
        var ans = find.findFirstChar();
        System.out.println(ans);
    }
}
