package Tree.BinaryTree;

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
