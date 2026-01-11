package DataStructure.Arrays;

public class ArrayOfOtherDataTypes {
    public static void main(String[] args) {
        // Defining and initializing an array of doubles
        double[] decimalNumbers = { 12.5, 45.6, 78.9, 23.4, 56.7 };

        // Defining and initializing an array of characters
        char[] characters = { 'A', 'B', 'C', 'D', 'E' };

        // Defining and initializing an array of strings
        String[] strings = { "Apple", "Banana", "Cherry", "Date", "Elderberry" };

        // Printing the arrays
        System.out.println("Array of doubles:");
        for (double num : decimalNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array of characters:");
        for (char ch : characters) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("Array of strings:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}
