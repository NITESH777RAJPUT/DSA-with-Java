package Methods;

public class IfElseReturn {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4)); // Calling the method with an even number
        System.out.println(checkEvenOdd(7)); // Calling the method with an odd number
    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even"; // Return "Even" if the number is even
        } else {
            return "Odd"; // Return "Odd" if the number is odd
        } // jab ham return use karte hain if else mein to hame to ham bas if mein return
          // karke chhod nahi sakte hame else mein bhi return karna padega nahi to error
          // aayega
    }
}
