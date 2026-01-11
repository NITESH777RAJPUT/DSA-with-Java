package DataStructure.Arrays;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 34, 67, 23, 89, 12, 90, 45 };

        // Assuming the first element is the maximum
        int max = numbers[0];

        // Iterating through the array to find the maximum element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The maximum number in the array is: " + max);
    }
}
