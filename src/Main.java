import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numLength;
        long sum=0;

        Scanner scanner = new Scanner(System.in);
        numLength = scanner.nextInt();
        for (int i = 0; i < numLength; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
