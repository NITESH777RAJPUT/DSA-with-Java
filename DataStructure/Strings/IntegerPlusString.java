package DataStructure.Strings;

public class IntegerPlusString {
    public static void main(String[] args) {
        System.out.println(5 + 6 + "Hello");
        System.out.println("Hello" + 5 + 6);
        System.out.println("Hello" + (5 + 6));
        System.out.println(5 + "Hello" + 6);
        System.out.println(5 + (6 + "Hello"));
    }
}
