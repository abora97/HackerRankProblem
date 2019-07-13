import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {

        int numOfElement;
        float numPositive = 0, numNegative = 0, numZero = 0;

        Scanner scanner = new Scanner(System.in);

        numOfElement = scanner.nextInt();

        int myArray[] = new int[numOfElement];

        for (int i = 0; i <= numOfElement-1; i++) {

            myArray[i] = scanner.nextInt();

            if (myArray[i] > 0) {
                numPositive++;
            } else if (myArray[i] == 0) {
                numZero++;
            } else {
                numNegative++;
            }
        }
        System.out.println("" + (numPositive / numOfElement));
        System.out.println("" + (numNegative / numOfElement));
        System.out.println("" + (numZero / numOfElement));
    }

}
