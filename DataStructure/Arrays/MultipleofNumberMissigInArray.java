package DataStructure.Arrays;

public class MultipleofNumberMissigInArray {
    public static void main(String[] args) {
        // Defining and initializing an array with some multiples of a number missing
        int[] numbers = { 3, 6, 9, 15, 18, 21 };
        int multipleOf = 3;
        int maxNumber = 21;

        // Finding the missing multiples
        System.out.println("Missing multiples of " + multipleOf + " are:");
        findMissingMultiples(numbers, multipleOf, maxNumber);
    }

    public static void findMissingMultiples(int[] numbers, int multipleOf, int maxNumber) {
        boolean[] isPresent = new boolean[(maxNumber / multipleOf) + 1];

        // Marking the present multiples in the boolean array
        for (int num : numbers) {
            if (num % multipleOf == 0) {
                isPresent[num / multipleOf] = true;
            }
        }

        // Printing the missing multiples
        for (int i = 1; i <= maxNumber / multipleOf; i++) {
            if (!isPresent[i]) {
                System.out.print(i * multipleOf + " ");
            }
        }
    }
}