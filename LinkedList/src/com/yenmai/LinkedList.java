package com.yenmai;

import java.util.NoSuchElementException;

public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first; //head
    private Node last; // tail
    private int size; // use size here is O(1) and loop to find size is On

    // Time complex = 1;
    public void addFirst(int value) {
        Node node = new Node(value);

        if(isEmpty()) {
        this.first = this.last = node;
        this.size++;
          return;
        }

        node.next = this.first;
        this.first = node;
        this.size++;
    }

    public void addLast(int value){

        Node node = new Node(value);


        if(isEmpty()){
            this.first = this.last  = node;
            this.size++;
            return;
        }
       this.last.next = node;
        this.last = node;
        this.size++;
    }

    public void deleteFirst() {
        if(isEmpty()) throw new NoSuchElementException();

        if(this.first == this.last) {
            this.first = this.last = null;
            this.size--;
            return;
        }

        Node newFirst = this.first.next;
        this.first.next = null;
        this.first = newFirst;
        this.size--;
    }

    public void deleteLast() {

        if(isEmpty()) throw new NoSuchElementException();

        if(this.first == this.last) {
            this.first = this.last = null;
            this.size--;
            return;
        }

        Node node = this.first;
        while (node.next != this.last) {
            node = node.next;
        }
        node.next = null;
        this.last = node;
        this.size--;
    }

    public boolean contains(int value){
        Node node = this.first;
        while (node != null){
            if(node.value == value) return true;
            node = node.next;
        }
        return false;
    }

    public int indexOf(int value){
        Node node = this.first;
        int index = 0;
        while (node != null){
            if(node.value == value) return  index;
            index++;
            node = node.next;
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void prints(){
        for (Node node = this.first; node != null; node = node.next) {
            System.out.println(node.value);
        }

    }

    public int getSize(){
        return this.size;
    }
    public int[] toArray(){
        int[] arr = new int[this.size];
        int index = 0;
        for (Node node = this.first; node != null; node = node.next) {
            arr[index++] = node.value;
        }
        return arr;
    }

    public void reverseList(){
        if(isEmpty()) return;
        Node previous = first;
        Node current = first.next;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        this.first.next = null;
        this.last = this.first;
        this.first = previous;

    }

    public int getKthFromTheEnd(int k){
       if(isEmpty()) {
           throw new IllegalArgumentException();
       }
        Node beginPoint = this.first;
        Node endPoint = this.first;

        for (int i = 1; i < k; i++){
            endPoint = endPoint.next;
            if(endPoint == null) throw new IllegalArgumentException();
        }
        while (endPoint != last) {
            beginPoint = beginPoint.next;
            endPoint = endPoint.next;
        }
        return beginPoint.value;
    }
}
