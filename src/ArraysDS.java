import java.util.Scanner;

public class ArraysDS {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);

        size=scanner.nextInt();

        int arr[] = new int[size];
        int temp=size-1;
        for (int i=0;i<size;i++){
            arr[temp]=scanner.nextInt();
            temp--;
        }
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
}
