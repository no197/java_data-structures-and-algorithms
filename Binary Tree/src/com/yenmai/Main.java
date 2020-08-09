package com.yenmai;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        boolean isFind = tree.find(5);
        System.out.println(isFind);

//        tree.traversePreOrder();
//        tree.traverseInOrder();
//        tree.traversePostOder();


        System.out.println(tree.isBST());

        System.out.println(tree.height());
    }


}
