package DataStructure.Strings;

public class BasicOfString {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Character at a specific index
        char charAtIndex5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex5);

        // Substring from index 7 to end
        String substringFrom7 = str.substring(7);
        System.out.println("Substring from index 7: " + substringFrom7);

        // Substring from index 0 to 5
        String substring0to5 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 5: " + substring0to5);

        // Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        // Convert to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        // Replace characters
        String replacedStr = str.replace('o', '0');
        System.out.println("String after replacement: " + replacedStr);

        // Check if string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("String contains 'World': " + containsWorld);
    }
}
