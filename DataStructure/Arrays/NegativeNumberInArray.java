package DataStructure.Arrays;

public class NegativeNumberInArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 12, -7, 5, -3, 9, -1, 4 };

        System.out.println("Negative numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }
    }

}
