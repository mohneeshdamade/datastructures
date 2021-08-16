package arrays.minimumswaps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    // 4 3 1 2
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int noOfSwaps = 0;
        for(int i = 0 ; i < arr.length  ; i++){
            while(arr[i] != i+1){
                swap(arr,i,arr[i]-1);
                noOfSwaps++;
            }
        }

        return noOfSwaps;
    }

    private static void swap(int[] arr, int sourceIdx, int targetIdx){
        int temp = arr[sourceIdx];
        arr[sourceIdx] = arr[targetIdx];
        arr[targetIdx] = temp;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
