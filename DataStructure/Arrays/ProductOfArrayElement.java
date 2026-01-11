package DataStructure.Arrays;

public class ProductOfArrayElement {
    public static void main(String[] args) {
        // Defining and initializing an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Calculating the product of all elements in the array
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }

        // Displaying the product
        System.out.println("Product of all array elements: " + product);
    }
}
