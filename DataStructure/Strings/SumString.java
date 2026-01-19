package DataStructure.Strings;

public class SumString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(3)); // Output: loWorld
        System.out.println(str.substring(0, 5)); // Output: Hello index 0 to 4
        System.out.println(str.substring(2, 7)); // Output: lloWor index 2 to 6
        System.out.println(str.substring(1, str.length())); // Output: oWorl index 1 to 8
    }
}
