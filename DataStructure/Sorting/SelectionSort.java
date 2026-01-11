package DataStructure.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 }; // Sample array to be sorted
        selectionSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) { // Function to perform selection sort
        int n = arr.length; // Get the number of elements in the array
        for (int i = 0; i < n - 1; i++) { // Traverse through all array elements
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Update minIndex if the element at j is smaller than the current minimum
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex]; // Swap the found minimum element with the first element
            arr[minIndex] = arr[i]; // swapping
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) { // Function to print the array
        for (int i = 0; i < arr.length; i++) { // Traverse through all array elements
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
        System.out.println(); // Print a new line at the end
    }
}