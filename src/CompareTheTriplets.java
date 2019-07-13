import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        int count = 0, aScore = 0, bScore = 0;

        for (int i = 0; i <= 5; i++) {
            if (i <= 2) {
                a[i] = scanner.nextInt();
            } else {
                b[count] = scanner.nextInt();
                count++;
            }

        }

        for (int i = 0; i <= 2; i++) {
            if (a[i] < b[i]) {
                bScore++;
            } else if (a[i] > b[i]) {
                aScore++;
            }
        }
        System.out.println(aScore + " " + bScore);
    }

}
