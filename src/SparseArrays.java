import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {

        int stringsSize, querySize;

        Scanner scanner = new Scanner(System.in);

        // get string size and data
        stringsSize = scanner.nextInt();

        String[] arrStrings = new String[stringsSize];

        for (int i = 0; i < stringsSize; i++) {
            arrStrings[i] = scanner.next();
        }


        // get Query size and data
        querySize = scanner.nextInt();

        String[] arrQuery = new String[querySize];

        for (int i = 0; i < querySize; i++) {
            arrQuery[i] = scanner.next();
        }

        // check matching
        int[] result = new int[querySize];

        for (int i = 0; i < querySize; i++) {
            for(int j=0;j<stringsSize;j++)
            if (arrQuery[i].equals(arrStrings[j])) {
                result[i]++;
            }

        }

        for(int i =0;i<querySize;i++)
            System.out.println(result[i]);

    }
}
