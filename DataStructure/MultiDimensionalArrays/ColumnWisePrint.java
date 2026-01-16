package DataStructure.MultiDimensionalArrays;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }; // Sample 2D array
        printColumnWise(arr);
    }

    public static void printColumnWise(int[][] arr) {
        int rows = arr.length; // number of rows
        int cols = arr[0].length; // number of columns
        for (int j = 0; j < cols; j++) { // Traverse through all columns
            for (int i = 0; i < rows; i++) { // Traverse through all rows of the current column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
