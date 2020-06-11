import java.util.Scanner;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final int N = in.nextInt();

        // Put all the clouds in an array
        final int[] clouds = new int[N];
        for (int i = 0; i < N; i++) {
            clouds[i] = in.nextInt();
        }

        // Check if two steps can be taken by verifying cloud type at
        // second step. Otherwise check if one step can be taken by verifying
        // if we still have any more clouds. If none of these conditions are met,
        // break out of infinite loop.
        int noOfJumps = 0, i = 0;
        while (true) {
            if (i + 2 < N && clouds[i + 2] == 0) {
                i += 2;
            } else if (i + 1 < N) {
                i++;
            } else {
                break;
            }
            noOfJumps++;
        }

        System.out.println(noOfJumps);

        in.close();
    }

}
