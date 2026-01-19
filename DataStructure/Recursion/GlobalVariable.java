package DataStructure.Recursion;

public class GlobalVariable {
    public static int counter = 0; // Global variable to keep track of function calls

    public static void main(String[] args) {
        int number = 5;
        factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        System.out.println("The function was called " + counter + " times.");
    }

    public static int factorial(int n) {
        counter++; // Increment the global counter each time the function is called
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
