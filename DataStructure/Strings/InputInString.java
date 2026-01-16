package DataStructure.Strings;

import java.util.Scanner;

public class InputInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Read a full line of input
        System.out.println("You entered: " + inputString); // Print the entered string
    }
}
