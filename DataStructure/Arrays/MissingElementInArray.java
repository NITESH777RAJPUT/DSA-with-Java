package DataStructure.Arrays;

public class MissingElementInArray {
    public static void main(String[] args) {
        // Defining and initializing an array with one missing element
        int[] numbers = { 1, 2, 4, 5, 6 };

        // Finding the missing element
        int missingElement = findMissingElement(numbers, 6);

        // Displaying the missing element
        System.out.println("The missing element is: " + missingElement);
    }

    public static int findMissingElement(int[] numbers, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}