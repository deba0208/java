package Tree;
import Tree.BinaryTree.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var tree = new BinarySearchTree();

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.flatten();
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(null);
        q.add(1);
        System.out.println(" ");
        var ans = numTrees(3);
        System.out.println(ans);
    }
    public static int numTrees(int n) {
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;
        for(int i = 2; i <= n; i++){
            var left = 0;
            var right = i-1;

            while(left < i){
                array[i] += array[left] * array[right];
                left++;
                right--;
            }
        }

        return array[n];
    }
}