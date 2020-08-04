package com.yenmai;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //BUILT-IN QUEUES
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

//        int first = queue.remove();
//        System.out.println(first);
        System.out.println(queue);
        reverse(queue);
        System.out.println(queue);

        // MY QUEUES
        com.yenmai.Queue myQueues = new com.yenmai.Queue(5);

        myQueues.enqueue(10);
        myQueues.enqueue(20);
        myQueues.enqueue(30);
        myQueues.enqueue(40);
        myQueues.enqueue(50);
        myQueues.dequeue();
        myQueues.dequeue();
        myQueues.enqueue(60);


        myQueues.print();
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
