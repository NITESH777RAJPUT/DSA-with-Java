package DataStructure.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        // // Displaying the original array
        // System.out.println("Original Array:");
        // printArray(numbers);

        // // Reversing the array
        // reverseArray(numbers);

        // // Displaying the reversed array
        // System.out.println("Reversed Array:");
        // printArray(numbers);
        // }
        // // Method to reverse the array
        // public static void reverseArray(int[] arr) {
        // int left = 0;
        // int right = arr.length - 1;
        // while (left < right) {
        // // Swapping elements
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;
        // left++;
        // right--;
        // }
        // }
        // // Method to print array elements
        // public static void printArray(int[] arr) {
        // for (int element : arr) {
        // System.out.print(element + " ");
        // }
        // System.out.println();

    }
}
