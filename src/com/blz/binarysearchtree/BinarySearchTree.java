package com.blz.binarysearchtree;

public class BinarySearchTree {
    public static Node insert(Node root, int value) {
        //comparison
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            // left subtree
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    //Search in BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {

            return search(root.right, key);
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree");

        int[] values = {56, 30, 70, 22, 40, 11, 3, 16, 60, 95, 65, 63, 67};

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        if (search(root, 63)) {
            System.out.println("Key is found");
        } else {
            System.out.println("key is not found");
        }

    }
}
