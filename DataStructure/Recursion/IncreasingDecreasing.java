package DataStructure.Recursion;

public class IncreasingDecreasing {
    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Increasing order:");
        printIncreasing(n);
        System.out.println("Decreasing order:");
        printDecreasing(n);
    }
}