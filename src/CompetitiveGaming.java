import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CompetitiveGaming {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();

        int n = input.nextInt();

        int rank = k;

        Integer[] arr = new Integer[n];
        Integer[] arrFinal = new Integer[n];
        Integer[] arrDuplicate = new Integer[n];


        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j]))
                    arrDuplicate[i] = arr[j];

            }
        }

        System.out.println("                   " + rank);

        for (int i = 0; i < k; i++) {
            arrFinal[i] = arr[i];
        }

        for (int i = 0; i < arrFinal.length; i++) {

            for (int j = 0; j < arrDuplicate.length; j++) {
                if (arrFinal != null) {
                    if (arrFinal[i].equals(arrDuplicate[j])) {
                        rank++;

                    }
                }
            }

        }

        System.out.println(rank);


    }
}
