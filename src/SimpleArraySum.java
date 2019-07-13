import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        int arraySize, total = 0,var;
        int[] ar;

        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        ar = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            var=scanner.nextInt();
            if (var > 0 &&var <= 1000)
                ar[i] = var;
        }
        for (int i = 0; i < ar.length; i++) {
            total = total + ar[i];
        }
        System.out.println(total);
    }
}
