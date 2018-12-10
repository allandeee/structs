package trees;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void BST () {
        Tree intTree = new Tree();
        int[] arr = { 25, 20, 15, 27, 30, 29, 26, 22, 32, 17 };
        for (int i=0; i<arr.length; i++) {
            intTree.insert(arr[i]);
        }
        intTree.traverseInOrder();

        System.out.println();

        System.out.println(intTree.get(27));
        System.out.println(intTree.get(17));
        System.out.println(intTree.get(8888));

        System.out.println("Minimum value: " + intTree.minValue());
        System.out.println("Maximum value: " + intTree.maxValue());

        intTree.delete(15);
        intTree.delete(17);
        intTree.delete(27);
        intTree.delete(8888);

        intTree.traverseInOrder();
        System.out.println();

    }

    public static void jdkTrees () {
        Map<Integer, String> map = new TreeMap<>();
        int[] arr = { 25, 20, 15, 27, 30, 29, 26, 22, 32, 17 };
        for (int i=0; i<arr.length; i++) {
            map.putIfAbsent(arr[i], arr[i]+"");
        }
        System.out.println(map);
        map.putIfAbsent(28, "28");
        System.out.println(map);
    }

    public static void main (String[] args) {
//        BST();
        jdkTrees();
    }

}
