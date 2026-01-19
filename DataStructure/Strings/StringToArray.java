package DataStructure.Strings;

public class StringToArray {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] charArray = new char[str.length()]; // Create a character array of the same length as the string
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);// Assign each character to the array
        }
        System.out.println("Character array:"); // Print the character array
        for (char ch : charArray) { // Enhanced for loop to print each character
            System.out.print(ch + " ");
        }
    }
}
