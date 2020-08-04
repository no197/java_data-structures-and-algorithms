package com.yenmai;

public class Queue {

    private int[] queue;
    private  int count;
    private int front;
    private int rear;


    public Queue(int capacity) {

        queue = new int[capacity];
    }

    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException();
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        count++;

    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        int item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;

    }
    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        return queue[front];
    }
    
    public boolean isFull(){

        return count == queue.length;
    }
    public boolean isEmpty(){

        return count == 0;
    }

    public void print(){
        for (int i = front; i < front + queue.length; i++) {
            System.out.println(queue[(i % queue.length)]);
        }
    }

}
