public class Practice {

    public static int recursiveBinSearch (int[] arr, int start, int end, int value) {

        if (start >= end) {
            return -1;
        }

        int midpoint =  (start + end) / 2;

        if (arr[midpoint] == value) {
            return midpoint;
        }
        else if (arr[midpoint] > value) {
            return recursiveBinSearch(arr, start, midpoint, value);
        }
        else {
            return recursiveBinSearch(arr, midpoint+1, end, value);
        }

    }

    public static int recursiveBinSearch (int[] arr, int value) {
        return recursiveBinSearch(arr, 0, arr.length-1, value);
    }

    public static void main (String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Value 1 at index: " + recursiveBinSearch(arr, 5));

    }

}
