import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        while(num > 0){
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
}}
