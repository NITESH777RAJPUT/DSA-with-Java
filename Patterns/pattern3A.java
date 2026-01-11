import java.util.*;

public class pattern3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (char j = (char)65; j <= (char)(65 + n - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
