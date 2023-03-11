package Tree.BinaryTree;

import java.util.ArrayList;

public class BinarySearchTree {

    private Node root;
    private class Node{
        private int value;
        private Node rightChild;
        private Node leftChild;

        public Node(int value) {
            this.value = value;
        }

        public String toString(){
            return "Node=" +value;
        }
    }

    public void insert(int value){
        var node = new Node(value);
        if(isEmpty(root)){
            root = node;
            return;
        }
        var current = root;
        while(true){
            if(current.value > value){
                if(isEmpty(current.leftChild)){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }
            else{
                if(isEmpty(current.rightChild)){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }
    private ArrayList<Integer> tree = new ArrayList<>();
    public void inOrder() {
        tree.clear();
        Node current = root;
        InOrderTraversing(current, tree);
        System.out.println(tree);
    }
    private void InOrderTraversing(Node node, ArrayList<Integer> array) {
        if (node == null)
            return;

        InOrderTraversing(node.leftChild, array);
        array.add(node.value);
        InOrderTraversing(node.rightChild, array);
    }
    private Node prev = null;
    private Node head = null;
    public void ConvertDll(){
        var node = root;
        ConvertDll(node);

    }
    private void ConvertDll(Node root){
        if(isEmpty(root))
            return;

        ConvertDll(root.leftChild);
        if(prev == null)head = root;
        else{
            root.leftChild = prev;
            prev.rightChild = root;
        }
        prev = root;
        ConvertDll(root.rightChild);
    }

    public int height() {
        return height(root);
    }
    private int height(Node node){
        if(isEmpty(node))
            return -1;
        if(node.rightChild == null && node.rightChild == null)
            return 0;
        return 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

    private boolean isEmpty(Node node){
        return node == null;
    }
}
