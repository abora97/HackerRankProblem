import java.util.Scanner;

public class birthdayCakeCandles {
    public static void main(String[] args) {
        int numOfCandle;
        long max = -1, temp = 0, t = 1;
        Scanner scanner = new Scanner(System.in);
        numOfCandle = scanner.nextInt();
        long[] ar = new long[numOfCandle];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scanner.nextInt();
            if (ar[i] > max) {
//                if (temp == max) {
//                    t++;
//                }
                // temp = max;
                max = ar[i];
            }
        }
        for (int i=0;i<ar.length;i++){
            if (ar[i]==max)
                temp++;
        }
        System.out.println(temp);
    }
}
