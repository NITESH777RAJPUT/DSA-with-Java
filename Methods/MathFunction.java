package Methods;

import java.lang.Math;
import java.util.*;

public class MathFunction {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(16)); // Square root

        System.out.println(Math.cbrt(27)); // Cube root

        System.out.println(Math.pow(2, 3)); // Power yaha 2 ki power 3 hai

        System.out.println(Math.pow(-4, 2)); // Negative number ka power bhi nikal sakte hai but integer hona chahiye
                                             // uper mein yaahi decminal mein nahi hona chaiye jaise yaha 2 hai 2.01 ya
                                             // 2.77 aisa nhai chalega
        System.out.println(Math.abs(-10)); // Absolute value negative to positive conert karta hai

        System.out.println(Math.max(5, 10)); // Maximum yaha maximum nikal sakte hai

        System.out.println(Math.min(5, 10)); // Minimum yaha minimum nikal sakte hai

        System.out.println(Math.sin(Math.PI)); // pi value sine isase ham pi ki value nikal sakte hai

        System.out.println(Math.cos(Math.PI / 2)); // pi/2 value cosine

        System.out.println(Math.exp(2)); // Exponential

        System.out.println(Math.round(4.6)); // Rounding yaha rounding kar sakte hai

        System.out.println(Math.floor(4.7)); // Floor yaha kisi number ko neeche ki taraf round kar sakte hai jaie ki
                                             // 4.7 ko 4 bana dega

        System.out.println(Math.floor(-4.7)); // Floor negative number ko neeche ki taraf round kar dega jaie ki -4.7 ko
                                              // -5 bana dega

        System.out.println(Math.ceil(4.3)); // Ceiling yaha kisi number ko upar ki taraf round kar sakte hai jaie ki 4.3
                                            // ko 5 bana dega ye floor ka opposite hai

        System.out.println(Math.ceil(-4.3)); // Ceiling negative number ko upar ki taraf round kar dega jaie ki -4.3 ko
                                             // -4 bana dega

        System.out.println(Math.random()); // Random number isase ham random number le sakte hai

        System.out.println(Math.log(10)); // Natural logarithm

        System.out.println(Math.log10(100)); // Base-10 logarithm

        System.out.println(Math.sin(Math.toRadians(30))); // Sine

        System.out.println(Math.cos(Math.toRadians(60))); // Cosine

        System.out.println(Math.tan(Math.toRadians(45))); // Tangent

    }

}
