package com.yenmai;

import java.util.Stack;

public class QueueWithTwoStack {
    private Stack<Integer> stack1 = new Stack<>(); // enqueue
    private Stack<Integer> stack2 = new Stack<>(); // dequeue

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if(isEmpty()) throw  new IllegalStateException();

        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    private  boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
