
import java.util.*;

public class pattern4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (97 + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
