package com.yenmai;

public class BinaryTree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value=" + this.value ;
        }
    }

    private  Node root;

    public void insert(int value){
        var node = new Node(value);

        if(root == null) {
            root = node;
            return;
        }

        //find where insert new node
        var current = root;
        while (true) {
            if(value < current.value) {
                if(current.leftChild == null) {
                    current.leftChild = node;
                    return;
                }
                current = current.leftChild;
            } else  {
                if(current.rightChild == null) {
                    current.rightChild = node;
                    return;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value){
        var current = root;
        while (current != null){
            // Current node equal value
            if(current.value == value) return  true;

            //If current node greater than value
            if(current.value > value) {
                current = current.leftChild;
            } else  {
                current = current.rightChild;
            }
        }
        return false;
    }

    public Node getRoot() {
        return root;
    }

    public void traversePreOrder(){
        traversePreOder(root);
    }

    public void traverseInOrder(){
        traverseInOder(root);
    }

    public void traversePostOder(){
        traversePostOder(root);
    }

    // Node -> Left -> Right
    private void traversePreOder(Node root){
        // Visit the root node
        if(root == null) return;
        System.out.println(root.value);

        //Visit all left node
        traversePreOder(root.leftChild);

        //Visit all right node
        traversePreOder(root.rightChild);

    }

    // Left -> Node -> Right
    private void traverseInOder(Node root){
        if(root == null) {
            return;
        }
        // Visit all left node
        traverseInOder(root.leftChild);

        // print current node
        System.out.println(root.value);

        //visit all right node
        traverseInOder(root.rightChild);
    }

    // Left -> Right -> Node
    private void traversePostOder(Node root){
        if(root == null) {
            return;
        }
        // Visit all left node
        traverseInOder(root.leftChild);

        //visit all right node
        traverseInOder(root.rightChild);

        // print current node
        System.out.println(root.value);


    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        //Check edge case root is null
        if(root == null) return -1;

        //Check the leaf node
        if(root.leftChild == null && root.rightChild == null) return 0;

        return  1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));
    }

    public boolean equalsTree(BinaryTree other) {
        if(other == null) return false;
        return equals(root, other.root);

    }

    public boolean equals(Node node1, Node node2) {
        if(node1 == null && node2 == null) return true;

        if(node1 != null && node2 != null) {
            return node1.value == node2.value
                    && equals(node1.leftChild, node2.leftChild)
                    && equals(node1.rightChild, node2.rightChild);
        }
        return false;
    }

    public boolean isBST(){
        return isBST(root,null,null);
    }

    private  boolean isBST(Node node, Integer lower, Integer upper) {
        if(node == null) return true;
        if(lower != null && node.value <= lower
        || upper != null && node.value >= upper)
            return  false;
        return isBST(node.leftChild, lower, node.value)
                && isBST(node.rightChild, node.value, upper);
    }





}
