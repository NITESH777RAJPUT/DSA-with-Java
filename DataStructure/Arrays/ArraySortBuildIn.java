package DataStructure.Arrays;

import java.util.Arrays;

public class ArraySortBuildIn {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 42, 23, 16, 15, 8, 4 };

        // Displaying the original array
        System.out.println("Original Array:");
        printArray(numbers);

        // Sorting the array using built-in Arrays.sort() method
        Arrays.sort(numbers);

        // Displaying the sorted array
        System.out.println("Sorted Array:");
        printArray(numbers);
    }

    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
