
import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }

        Arrays.sort(c);
        int total = 0;

        for (int i = 0; i < n - 1; i++) {
            if (c[i] == c[i + 1]) {
                total++;
                i = i + 1;
            }
        }
        System.out.println(total);

    }
}
