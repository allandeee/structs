package search;

public class linear {

    public static int linearSearch (int[] input, int value) {
        for (int i=0;i<input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        System.out.println("-15 found at index " + linearSearch(intArray, -15));
        System.out.println("1 found at index " + linearSearch(intArray, 1));
        System.out.println("8888 found at index " + linearSearch(intArray, 8888));
        System.out.println("-22 found at index " + linearSearch(intArray, -22));
    }

}
