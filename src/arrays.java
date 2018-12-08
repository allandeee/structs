public class arrays {

    private static void primitiveArr () {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = -7;
        intArray[2] = 13;
        intArray[3] = 15;
        intArray[4] = 18;
        intArray[5] = 35;
        intArray[6] = -15;

//        bubbleSort(intArray);
//        selectSort(intArray);
//        insertSort(intArray);
        shellSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void bubbleSort (int[] arr) {
        for (int lastUnsort = arr.length - 1; lastUnsort > 0; lastUnsort--) {
            for (int i = 0; i < lastUnsort; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
    }

    public static void selectSort (int[] arr) {
        for (int lastUnsort = arr.length - 1; lastUnsort > 0; lastUnsort--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsort; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, largest, lastUnsort);
        }
    }

    public static void insertSort (int[] arr) {
        for (int firstUnsort = 1; firstUnsort < arr.length; firstUnsort++) {
            int newElement = arr[firstUnsort];
            int i;
            for (i = firstUnsort; i > 0 && arr[i-1] > newElement; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }
    }

    public static void shellSort (int[] arr) {
        for (int gap = arr.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;
                while (j >= gap && arr[j-gap] > newElement) {
                    arr[j] = arr[j-gap];
                    j -= gap;
                }
                arr[j] = newElement;
            }
        }
    }

    public static void main(String[] args) {
        primitiveArr();
    }
}
