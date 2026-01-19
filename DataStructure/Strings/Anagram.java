package DataStructure.Strings;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare sorted arrays
        boolean areAnagrams = java.util.Arrays.equals(charArray1, charArray2);

        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
