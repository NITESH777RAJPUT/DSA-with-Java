import java.util.Scanner;

public class sumoofdigit {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digit = 0;
        
        for(int i = 0; i < num; i++){
            digit = digit + num % 10;
            num = num / 10;
           if(num == 0){
               System.out.println("Sum of digits: " + digit);
               break;
           }
        }

    } 
}
