package DataStructure.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length; // number of elements in array
        for (int i = 0; i < n - 1; i++) { // Traverse through all array elements
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) { // Traverse the array from 0 to n-i-1
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j]; // temporary variable to hold value
                    arr[j] = arr[j + 1];// swapping
                    arr[j + 1] = temp; // swapping
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
