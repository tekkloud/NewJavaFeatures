package org.success.high.paying.happy.job;

public class Node {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    private Node left, right;

    public Node(int value){
        this.value= value;
        left= right = null;
    }
}
