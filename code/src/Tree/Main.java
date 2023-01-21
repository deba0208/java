package Tree;
import Tree.BinaryTree.*;

public class Main {
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.insert(15);
        tree.insert(12);
        tree.insert(18);
        tree.insert(16);
        tree.insert(20);
        tree.insert(14);
        tree.insert(10);

        var getValue = tree.find(11);
        System.out.println(getValue);
    }
}
