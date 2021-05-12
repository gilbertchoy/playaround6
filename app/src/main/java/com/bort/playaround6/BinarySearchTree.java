package com.bort.playaround6;

import android.util.Log;

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

    public void insert(int data){
        Node newNode = new Node(data);

        if(root == null){  //if tree is emply then set root node
            root = newNode;
            return;
        }
        else{   //start search with the root node as the current node
            Node current = root;

            while(true){
                if(data<current.data){
                    if(current.left == null){
                        current.left = newNode;
                        return;
                    }
                    else{
                        current = current.left;
                    }
                }
                else{
                    if(current.right == null){
                        current.right = newNode;
                        return;
                    }
                    else{
                        current = current.right;
                    }
                }

            }

        }
    }

    public void inorderTraversal(Node node){
        //Check whether tree is empty
        if(root == null){
            Log.d("berttest","Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);
            Log.d("berttest", "bst inorder traversal" + node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }
    }

    //minNode() will find out the minimum node
    public Node minNode(Node root) {
        if (root.left != null)
            return minNode(root.left);
        else
            return root;
    }

    //deleteNode() will delete the given node from the binary search tree
    public Node deleteNode(Node node, int value) {
        if(node == null){
            return null;
        }
        else {
            //value is less than node's data then, search the value in left subtree
            if(value < node.data)
                node.left = deleteNode(node.left, value);

                //value is greater than node's data then, search the value in right subtree
            else if(value > node.data)
                node.right = deleteNode(node.right, value);

                //If value is equal to node's data that is, we have found the node to be deleted
            else {
                //If node to be deleted has no child then, set the node to null
                if(node.left == null && node.right == null)
                    node = null;

                    //If node to be deleted has only one right child
                else if(node.left == null) {
                    node = node.right;}

                //If node to be deleted has only one left child
                else if(node.right == null) {
                    node = node.left;
                }

                //If node to be deleted has two children node
                else {
                    //then find the minimum node from right subtree
                    Node temp = minNode(node.right);
                    //Exchange the data between node and temp
                    node.data = temp.data;
                    //Delete the node duplicate node from right subtree
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node;
        }
    }


}
