package arrays.leftrotation;

import java.util.Scanner;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d
 * <p>
 * https://www.geeksforgeeks.org/array-rotation/
 *
 * @author Mohneesh
 */


public class ArrayRotation {

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int noOfRotations = sc.nextInt();
        int[] arr = new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            arr[i] = sc.nextInt();
        }

        int j, temp;
        //Loop for d times
        for (int i = 0; i < noOfRotations; i++) {
            //Store the first element in temp variable
            temp = arr[0];

            //Move the elements
            for (j = 0; j < lengthOfArray - 1; j++)
                arr[j] = arr[j + 1];

            arr[lengthOfArray-1] = temp;

        }
        printArray(arr);

    }

    private static void printArray(int[] arr) {

        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}
