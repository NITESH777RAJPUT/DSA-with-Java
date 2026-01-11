package DataStructure.Arrays;

public class SumOfelementsofArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}
