package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class expression {
    private String input;
    private final List<Character> rightBracket = Arrays.asList(')', '}', '>', ']');
    private final List<Character> leftBracket = Arrays.asList('(', '{', '<', '[');
    public expression(String input) {
        this.input = input;
    }


    public boolean isAccepted() {
        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            if(isLeftBracket(ch)){
                stack.push(ch);
            }

            if (isRightBracket(ch)) {
                if(stack.isEmpty())return false;
                var top = stack.pop();
                if(isBracketMatch(ch, top))return false;
            }
        }

        return stack.isEmpty();
    }


    private boolean isLeftBracket(char ch){
        return leftBracket.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBracket.contains(ch);
    }

    private boolean isBracketMatch(char left, char right) {
        return  leftBracket.indexOf(left) == rightBracket.indexOf(right);
    }
}
