package Tree;
import Tree.BinaryTree.*;

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(8);
        tree.insert(10);
        tree.insert(2);
        tree.insert(6);
        //tree.insert(60);
        Map<Integer, String> map = new HashMap<>();
        
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
        System.out.println(tree.height());
    }
}
