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

    public void insert(int data){
        Node newNode = new Node(data);

        if(root == null){  //if tree is emply then set root node
            root = newNode;
            return;
        }
        else{   //start search with the root node as the current node
            Node current = root;
            Node parent = null;

            while(true){
                //set the parent to the current node, effectively the values of current and parent are the same
                parent = current;

                if(data<current.data){
                    if(current.left == null){
                        current.left = newNode;
                        return;
                    }
                    else{
                        current = current.left;
                    }


                }

            }

        }
    }

    public void inorderTraversal(Node node){
        //Check whether tree is empty
        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }


    }



}
