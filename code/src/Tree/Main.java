package Tree;
import Tree.BinaryTree.*;

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        var tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);
        tree.insert(2);
        tree.insert(6);

        tree.insert(60);
        tree.inOrder();
        var a = tree.height();
        System.out.println(a);
    }
}
