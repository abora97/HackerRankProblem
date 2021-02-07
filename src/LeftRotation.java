import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int arrSize = input.nextInt();

        //rotationCount determine the number of times an array should be rotated
        int rotationCount=input.nextInt();

        //Initialize array
        int [] arr =new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            arr[i]=input.nextInt();
//            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward left
        for(int i = 0; i < rotationCount; i++){
            int j, first;
            //Stores the first element of the array
            first = arr[0];
            for(j = 0; j < arr.length-1; j++){
                //Shift element of array by one
                arr[j] = arr[j+1];
            }
            //First element of array will be added to the end
            arr[j] = first;
        }
        System.out.println();

        //Displays resulting array after rotation
//        System.out.println("Array after left rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
