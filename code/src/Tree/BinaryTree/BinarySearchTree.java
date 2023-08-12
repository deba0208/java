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

    public int size(){
        return size(root);
    }
    private int size(Node root){
        if(isEmpty(root))return 0;
        if(isLeaf(root))return 1;
        return 1 + size(root.leftChild) + size(root.rightChild);
    }

    public int countLeaves(){
        return countLeaves(root);
    }
    private int  countLeaves(Node root){
        if(isEmpty(root))return 0;
        if(isLeaf(root))return 1;
        return countLeaves(root.leftChild)+countLeaves(root.rightChild);
    }

    public int max() {
        if(isEmpty(root))
            throw new IllegalStateException();
        return max(root);
    }
    private int max(Node root){
        if (root.rightChild == null)
            return root.value;

        return max(root.rightChild);
    }

    public int min(){
        if(isEmpty(root))
            throw new IllegalStateException();
        return min(root);
    }
    private int min(Node root){
        if (root.leftChild == null)
            return root.value;

        return min(root.leftChild);
    }

    public boolean contains(int value){
        return contains(value, root);
    }
    private boolean contains(int value, Node root){
        if(isEmpty(root))return false;
        if(root.value == value)
            return true;

        return contains(value, root.leftChild) || contains(value, root.rightChild);
    }

    public boolean areSibling(int first, int second){
        return areSibling(root, first, second);
    }
    private boolean areSibling(Node root, int first, int second){
        if(root == null)return false;

        var areSibling = false;
        if(root.leftChild != null && root.rightChild != null){
            areSibling = (root.leftChild.value == first && root.rightChild.value == second)||
                   (root.leftChild.value == second && root.rightChild.value == first);
        }

        return areSibling ||
               areSibling(root.leftChild, first, second) ||
               areSibling(root.rightChild, first, second);
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
    private boolean isLeaf(Node node){return node.rightChild == null && node.leftChild == null;}
    int count = 0;
    int value = 0;
    public int kthSmallest(int k) {
        ans(root, k);
        return value;
    }
    public void ans(Node root, int k){
        if(root == null)return;

        ans(root.leftChild, k);
        count++;
        if(count == k){
            value = root.value;
            return;
        }
        ans(root.rightChild, k);
    }
    Node head2 = null;
    public void flatten() {
        if(root == null)return;
        list(root);
    }

    private void list(Node node){
        if(node.rightChild != null)list(node.rightChild);
        if(node.leftChild != null)list(node.leftChild);
        node.leftChild = null;
        node.rightChild = head2;
        head2 = node;

    }
}
