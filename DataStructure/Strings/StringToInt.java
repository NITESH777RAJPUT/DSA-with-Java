package DataStructure.Strings;

public class StringToInt {
    public static void main(String[] args) {
        String str = "12345";
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Convert character to digit by subtracting '0'
            int digit = ch - '0';
            result = result * 10 + digit;
        }
        System.out.println("The integer value is: " + result);
    }
}
