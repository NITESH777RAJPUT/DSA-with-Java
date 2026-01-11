package Methods;

import java.lang.Math;
import java.util.*;

public class MaxThreeBuiltIn {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        int max = Math.max(a, Math.max(b, c));
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }
}
