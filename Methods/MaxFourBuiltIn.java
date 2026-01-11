package Methods;

import java.lang.Math;
import java.util.*;

public class MaxFourBuiltIn {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        int d = 25;
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("The maximum of " + a + ", " + b + ", " + c + ", and " + d + " is: " + max);
    }
}
