package DataStructure.MultiDimensionalArrays;

import java.util.Scanner;

public class InputInMultidimensionalArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: "); // Prompt user for number of rows
        int rows = scanner.nextInt(); // Read number of rows
        System.out.print("Enter number of columns: "); // Prompt user for number of columns
        int cols = scanner.nextInt(); // Read number of columns
        int[][] arr = new int[rows][cols]; // Declare a 2D array with specified rows and columns
        System.out.println("Enter elements of the array:"); // Prompt user to enter array elements
        for (int i = 0; i < rows; i++) { // Traverse through all rows
            for (int j = 0; j < cols; j++) { // Traverse through all columns
                arr[i][j] = scanner.nextInt(); // Read each element into the array
            }
        }
    }
}
