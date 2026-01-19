package DataStructure.Recursion;

public class NumberToOne {
    public static void main(String[] args) {
        int number = 5;
        printNumbersToOne(number);
    }

    public static void printNumbersToOne(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumbersToOne(n - 1);
    }
}