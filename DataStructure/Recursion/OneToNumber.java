package DataStructure.Recursion;

public class OneToNumber {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Printing numbers from 1 to " + abs(number));
        printOneToNumber(1, number);
    }

    public static void printOneToNumber(int current, int target) {
        if (current > target) {
            return;
        }
        System.out.println(current);
        printOneToNumber(current + 1, target);
    }

    public static int abs(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }

}