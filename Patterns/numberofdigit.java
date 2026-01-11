import java.util.*;
public class numberofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; num > 0; i++){
            num = num / 10;
            System.out.println("Number of digits: " + i);
        }
    }
}
