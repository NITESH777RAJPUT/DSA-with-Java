package DataStructure.Arrays;

public class SecondMaximumElementInArray {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 12, 35, 1, 10, 34, 1 };

        // Finding the second largest element
        int secondLargest = findSecondLargest(numbers);

        // Displaying the result
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element in the array is: " + secondLargest);
        } else {
            System.out.println("There is no second largest element in the array.");
        }
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}