package com.yenmai;

import java.util.Arrays;

public class Stack {
    private int[] stack = new int[5];
    private int count;

    public void push(int item){
        if(count == stack.length) throw new StackOverflowError();

        stack[count++] = item;
    }

    public int pop() {
        if(isEmpty()) throw new IllegalStateException();
        return stack[--count];
    }

    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        return stack[count - 1];
    }

    public boolean isEmpty(){
        return  count == 0;
    }

    @Override
    public String toString() {
        int[] arr = Arrays.copyOfRange(stack,0,count);
        return Arrays.toString(arr);
    }
}
