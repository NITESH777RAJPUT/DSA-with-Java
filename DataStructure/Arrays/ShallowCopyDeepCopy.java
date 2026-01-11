package DataStructure.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = { 1, 2, 3, 4, 5 };

        // Shallow copy (reference copy)
        int[] shallowCopy = originalArray;

        // Deep copy (new array with copied values)
        int[] deepCopy = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            deepCopy[i] = originalArray[i];
        }

        // Modifying the original array
        originalArray[0] = 99;

        // Displaying the arrays to show the difference
        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("Shallow Copy Array:");
        printArray(shallowCopy);

        System.out.println("Deep Copy Array:");
        printArray(deepCopy);
    }

    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}