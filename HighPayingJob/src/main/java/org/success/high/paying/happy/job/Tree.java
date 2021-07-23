package org.success.high.paying.happy.job;

public class Tree {

    Node root;

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
    }

}


