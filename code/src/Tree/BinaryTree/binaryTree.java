package Tree.BinaryTree;

import java.util.ArrayList;

public class binaryTree {


    private class Node{
        private int value;
        private Node rightChild;
        private Node leftChild;

        public Node(int value){this.value = value;}

        @Override
        public String toString() {
            return "Node=" +value;
        }
    }

    private Node root;

    public void insert(int value) {
        var newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        var current = root;
        while (true) {
            if(value > current.value){
                if(current.rightChild == null){
                    current.rightChild = newNode;
                    break;
                }

                current = current.rightChild;
            }else{
                if(current.leftChild == null){
                    current.leftChild = newNode;
                    break;
                }

                current = current.leftChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;

//        while (current != null) {
//            if(current.value > value){
//                current = current.leftChild;
//            } else if (current.value < value) {
//                current = current.rightChild;
//            }else
//                return true;
//        }
//
//        return false;
        return findValue(current, value);
    }

    private ArrayList<Integer> tree = new ArrayList<>();
    public void preOrder() {
        tree.clear();
        Node current = root;
        preOrderTraversing(current, tree);
        System.out.println(tree);
    }
    public void inOrder() {
        tree.clear();
        Node current = root;
        InOrderTraversing(current, tree);
        System.out.println(tree);
    }
    public void postOrder() {
        tree.clear();
        Node current = root;
        postOrderTraversing(current, tree);
        System.out.println(tree);
    }

    public int height() {
        return height(root);
    }

    public int min() {
        if(isEmpty(root))
            throw new IllegalStateException();
        if(isBinarySearchTree())
            return bstMin(root);
        else
            return min(root);
    }

    public int max() {

        return max(root);
        //return bstMax(root);
    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node node, int min, int max) {
        if(isEmpty(node))
            return true;

        if(root.value < min || root.value > max)
            return false;

        return isBinarySearchTree(node.leftChild, min, node.value - 1)
                &&
                isBinarySearchTree(node.rightChild, root.value + 1, max);
    }
    private int bstMax(Node node) {
        if(isLeaf(node))
            return node.value;

        return bstMax(node.rightChild);
    }

    private int max(Node node) {
        if(isEmpty(root))
            throw new IllegalStateException();
        if(root.rightChild == null)
            return node.value;

        var left = max(node.leftChild);
        var right = max(node.rightChild);

        return Math.max(Math.max(left, right), root.value);
    }
    private boolean isEmpty(Node root) {
        return root == null;
    }

    //this method is use in unbalance binary tree
    private int min(Node node) {
        if(isLeaf(node))
            return node.value;
        var left = min(node.leftChild);
        var right = min(node.rightChild);
        return Math.min(Math.min(right, left), node.value);
    }

    //this method is use in balance tree
    private int bstMin(Node node) {
        if(isLeaf(node))
            return node.value;

        return bstMin(node.leftChild);
    }

    private boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }
    private int height(Node root) {
        if(isEmpty(root))
            return -1;
        if(isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }
    private void preOrderTraversing(Node node,  ArrayList<Integer> array){
        if(isEmpty(node))
            return;

        array.add(node.value);
        preOrderTraversing(node.leftChild, array);
        preOrderTraversing(node.rightChild, array);
    }
    private void InOrderTraversing(Node node, ArrayList<Integer> array) {
        if (node == null)
            return;

        InOrderTraversing(node.leftChild, array);
        array.add(node.value);
        InOrderTraversing(node.rightChild, array);
    }
    private void postOrderTraversing(Node node, ArrayList<Integer> array) {
        if (node == null)
            return;

        postOrderTraversing(node.leftChild, array);
        postOrderTraversing(node.rightChild, array);
        array.add(node.value);
    }
    private boolean findValue(Node node, int value) {
        if (node == null) {
            return false;
        } else if (node.value == value) {
            return true;
        }else{
            if(node.value > value){
                return findValue(node.leftChild, value);
            } else if (node.value < value) {
                return findValue(node.rightChild, value);
            }else{
                return false;
            }
        }
    }
}
