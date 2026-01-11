package DataStructure.Arrays;

public class LinearSearchInArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 5, 3, 8, 6, 2, 7, 4, 1 };

        // Element to be searched
        int target = 6;

        // Performing linear search
        int resultIndex = linearSearch(numbers, target);

        // Displaying the result
        if (resultIndex != -1) {
            System.out.println("Element " + target + " found at index: " + resultIndex);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }
}