package com.yenmai;

import java.util.Stack;

public class StringReverser {

    public String reverse(String str){

        if(str == null) throw  new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for(char character: str.toCharArray()){
            stack.push(character);
        }
        StringBuffer reverseStr = new StringBuffer();
        while (!stack.isEmpty()){
            reverseStr.append(stack.pop());
        }

        return reverseStr.toString();
    }
}
