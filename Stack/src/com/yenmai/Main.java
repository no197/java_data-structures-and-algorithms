package com.yenmai;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // BUILD-IN STACK
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Integer top = stack.peek();
        System.out.println(top);
        System.out.println(stack);

        top = stack.pop();
        System.out.println(top);
        System.out.println(stack);


        //REVERSE STRING
        StringReverser stringReverser = new StringReverser();
        String newStr  = stringReverser.reverse("abcdef");
        System.out.println(newStr);

        // EXPRESSION BALANCE
        BalanceExpression balanceExpression = new BalanceExpression();
        String expression = "(({1 + 2}))";
        System.out.println(balanceExpression.isBalance(expression));

        //HANDLE STACK

        com.yenmai.Stack myStack = new com.yenmai.Stack();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());

        System.out.println(myStack);

    }
}
