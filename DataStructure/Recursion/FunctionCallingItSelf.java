package DataStructure.Recursion;

public class FunctionCallingItSelf {
    public static void main(String[] args) {
        int number = 5;
        int factorialResult = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
