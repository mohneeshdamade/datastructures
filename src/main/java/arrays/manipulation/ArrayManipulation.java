package arrays.manipulation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array
 * element between two given indices, inclusive. Once all operations have been performed, return the maximum value in
 * the array.
 *
 * Input Format
 *
 * The first line contains two space-separated integers n and m, the size of the array and the number of operations.
 * Each of the next m lines contains three space-separated integers a, b and k, the left index, right index and summand.
 */
public class ArrayManipulation {


    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int arraylength = in.nextInt();
        int operations = in.nextInt();

        int[][] queries = new int[operations][3];
        for (int i = 0; i < operations; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = in.nextInt();
            }
        }

        long [] initialArray = new long[arraylength];
        for (int i = 0; i < operations; i++) {
            for (int j = queries[i][0] - 1; j <= queries[i][1] -1; j++) {
                initialArray[j] += queries[i][2];
            }
        }
        Arrays.parallelSort(initialArray);
        System.out.print(initialArray[arraylength-1]);

    }


}
