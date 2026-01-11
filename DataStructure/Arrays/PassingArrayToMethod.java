package DataStructure.Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Passing the array to the method
        printArrayElements(numbers);
    }

    // Method to print array elements
    public static void printArrayElements(int[] arr) {
        System.out.println("Array elements:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}