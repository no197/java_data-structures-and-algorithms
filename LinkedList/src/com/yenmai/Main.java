package com.yenmai;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();

        list.addFirst(20);
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(40);
        list.addLast(50);

//        list.deleteFirst();
//        list.deleteLast();
//        list.reverseList();
//        System.out.println(list.contains(10));
//        System.out.println(list.getSize());
//        System.out.println(list.indexOf(40));

        System.out.println(list.getKthFromTheEnd(3));

    }
}
