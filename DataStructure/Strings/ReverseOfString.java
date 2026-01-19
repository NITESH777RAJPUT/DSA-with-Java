package DataStructure.Strings;

public class ReverseOfString {
    public static void main(String[] args) {
        // using loop
        String str = "HelloWorld";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversedStr);
        // now using .reverse() method
        StringBuilder sb = new StringBuilder(str);
        String reversedUsingMethod = sb.reverse().toString();
        System.out.println("Reversed string using StringBuilder: " + reversedUsingMethod);

    }
}
