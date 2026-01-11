package DataStructure.MultiDimensionalArrays;

public class PrintMultiDimensionalDArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Sample 2D array
        print2DArray(arr);
    }

    public static void print2DArray(int[][] arr) { // Function to print 2D array
        for (int i = 0; i < arr.length; i++) { // Traverse through all rows
             // Traverse through all columns of the current row
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}