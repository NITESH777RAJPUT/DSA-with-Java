package DataStructure.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] arr = { 10, 90, 49, 2, 1, 5, 23 };

        // Converting the array into wave form
        convertToWave(arr);

        // Displaying the wave form array
        System.out.println("Wave Form Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void convertToWave(int[] arr) {
        int n = arr.length;

        // Sorting the array
        java.util.Arrays.sort(arr);

        // Swapping adjacent elements to form wave
        for (int i = 0; i < n - 1; i += 2) {
            // Swap arr[i] and arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
