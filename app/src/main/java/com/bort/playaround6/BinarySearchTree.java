package com.bort.playaround6;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree(){
        root = null;
    }

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left = null;
            this.right = null;
        }
    }




}
