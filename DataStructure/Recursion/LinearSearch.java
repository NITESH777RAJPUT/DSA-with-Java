package DataStructure.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 9 };
        int target = 7;
        int resultIndex = linearSearch(arr, 0, target);

    }

    public static int linearSearch(int[] arr, int index, int target) {
        if (index >= arr.length) {
            return -1; // Target not found
        }
        if (arr[index] == target) {
            return index; // Target found
        }
        return linearSearch(arr, index + 1, target);
    }
}
