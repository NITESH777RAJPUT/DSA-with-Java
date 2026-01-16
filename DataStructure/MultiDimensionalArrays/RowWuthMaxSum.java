package DataStructure.MultiDimensionalArrays;

public class RowWuthMaxSum {
    public static void main(String[] args) { // Main method
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }; // Sample 2D array
        int maxRowIndex = rowWithMaxSum(arr);
        System.out.println("Row with maximum sum is: " + maxRowIndex);
    }

    public static int rowWithMaxSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest integer value
        int maxRowIndex = -1;
        for (int i = 0; i < arr.length; i++) { // Traverse through all rows
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) { // Traverse through all columns of the current row
                sum += arr[i][j];
            }
            if (sum > maxSum) { // Update maxSum and maxRowIndex if current row sum is greater
                maxSum = sum;
                maxRowIndex = i;
            }
        }
        return maxRowIndex; // Return the index of the row with maximum sum
    }
}