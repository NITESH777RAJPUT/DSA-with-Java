import java.util.*;

public class pattern3A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (65 + i - 1) + " ");
            }
            System.out.println();
        }
    }
}
