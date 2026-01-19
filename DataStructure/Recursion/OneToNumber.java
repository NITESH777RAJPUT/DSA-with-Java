package DataStructure.Recursion;

public class OneToNumber {

    public static void main(String[] args) {
        int number = 5;
        printOneToNumber(1, number);
    }

    public static void printOneToNumber(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printOneToNumber(current + 1, n);
    }

}