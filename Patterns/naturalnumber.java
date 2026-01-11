import java.util.*;
public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + num;
            System.out.println("The sum of natural numbers up to " + num + " is " + sum + ".");
        }
        
    }
}
        