package stack;
import java.util.Stack;
public class stackClass {

    private String input;
    public stackClass(String input) {
        this.input = input;
    }

    public String reverse(){
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);
        StringBuffer reversed = new StringBuffer();
        while(!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}