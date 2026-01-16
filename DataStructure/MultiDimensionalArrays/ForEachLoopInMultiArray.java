package DataStructure.MultiDimensionalArrays;

public class ForEachLoopInMultiArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }; // Sample 2D array
        printUsingForEach(arr);
    }

    public static void printUsingForEach(int[][] arr) {
        for (int[] row : arr) { // For each row in the 2D array
            for (int element : row) { // For each element in the current row
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
