package com.yenmai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalanceExpression {
    private List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');
    public boolean isBalance(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char character : expression.toCharArray()) {
            if (leftBrackets.contains(character))
                stack.push(character);

            if (rightBrackets.contains(character)) {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if(!isMatchBracket(top, character)) return false;
            }

        }
        return  stack.empty();
    }

    private boolean isMatchBracket(char left, char right) {
        return  leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
