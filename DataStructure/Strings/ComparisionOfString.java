package DataStructure.Strings;

public class ComparisionOfString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Using equals() method
        boolean isEqual = str1.equals(str2);
        System.out.println("Using equals(): " + isEqual);

        // Using == operator
        boolean isSameReference = (str1 == str2);
        System.out.println("Using == operator: " + isSameReference);

        // Using compareTo() method
        int comparisonResult = str1.compareTo(str2);
        System.out.println("Using compareTo(): " + comparisonResult);
    }
}