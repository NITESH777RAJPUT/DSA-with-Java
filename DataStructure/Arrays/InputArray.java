package DataStructure.Arrays;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Defining an array to hold 5 integers
        int[] numbers = new int[5];

        // Reading input from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Printing the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
