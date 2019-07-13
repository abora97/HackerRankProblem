import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        int numStaircase, numSpace = 1, temp;
        Scanner scanner = new Scanner(System.in);

         numStaircase = scanner.nextInt();
        //numStaircase = 6;
        numSpace = numStaircase - numSpace;
        temp = numSpace;
        for (int i = 1; i <= numStaircase; i++) {

            if (temp <= 0) {
                for (int q = 1; q <= numStaircase; q++) {
                    System.out.print("#");
                }
            } else {
                for (int k = 1; k <= numStaircase; k++) {
                    if (numSpace > 0) {
                        System.out.print(" ");
                        numSpace--;
                    } else {
                        System.out.print("#");
                    }
                }
            }

            numSpace=temp-1;
            temp--;
            System.out.println();
        }
    }
}
