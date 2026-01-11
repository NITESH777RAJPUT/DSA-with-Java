package DataStructure.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };

        // Number of positions to rotate
        int k = 3;

        // Rotating the array
        rotateArray(numbers, k);

        // Displaying the rotated array
        System.out.println("Rotated Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k is greater than n

        // Reverse the entire array
        reverse(arr, 0, n - 1);
        // Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Reverse the remaining n-k elements
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swapping elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
