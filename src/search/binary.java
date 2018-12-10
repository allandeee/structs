package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class binary {

    public static int iterativeBinarySearch (List<Integer> input, int value) {
        int start = 0;
        int end = input.size();

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (input.get(midpoint) == value) {
                return midpoint;
            }
            else if (input.get(midpoint) < value) {
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch (List<Integer> input, int value) {
        return recursiveBinarySearch(input, 0, input.size(), value);
    }

    public static int recursiveBinarySearch (List<Integer> input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;
        if (input.get(midpoint) == value) {
            return midpoint;
        }
        else if (input.get(midpoint) < value) {
            return recursiveBinarySearch(input, midpoint+1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }

    public static void main (String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(1, 20, 35, -22, -15, 55, 7));
        Collections.sort(arr);
        System.out.println(arr);
//        System.out.println("Value -15 at index " + iterativeBinarySearch(arr, -15));
//        System.out.println("Value 35 at index " + iterativeBinarySearch(arr, 35));
//        System.out.println("Value 8888 at index " + iterativeBinarySearch(arr, 8888));
//        System.out.println("Value 1 at index " + iterativeBinarySearch(arr, 1));\
        System.out.println("Value -15 at index " + recursiveBinarySearch(arr, -15));
        System.out.println("Value 35 at index " + recursiveBinarySearch(arr, 35));
        System.out.println("Value 8888 at index " + recursiveBinarySearch(arr, 8888));
        System.out.println("Value 1 at index " + recursiveBinarySearch(arr, 1));
    }

}
