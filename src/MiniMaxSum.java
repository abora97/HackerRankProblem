import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        long[] ar = new long[5];
        long min = 0, max = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
            min += ar[i];
            max -= ar[i];
        }
        for (int i = 0; i < ar.length; i++) {
            long sum = (  ar[1] + ar[2] + ar[3] + ar[4]);
            System.out.println(ar[i]);
             System.out.println(sum);
            System.out.println("********************");
            if (min > sum)
                min = sum;
            if (max < sum)
                max = sum;
        }
        System.out.println(min + " " + max);
    }
}
