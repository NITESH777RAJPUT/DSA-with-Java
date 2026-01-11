package DataStructure.Arrays;

public class ForEachLoopInAraay {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 11, 22, 33, 44, 55 };

        // Using for-each loop to iterate through the array and it is use for only read
        // the data cannot modify
        System.out.println("Array elements using for-each loop:");
        for (int number : numbers) { // for-each loop
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
