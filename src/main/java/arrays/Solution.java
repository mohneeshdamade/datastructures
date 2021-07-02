package  arrays;
import java.util.*;

/**
 * An array is a type of data structure that stores elements of the same type in a contiguous block of memory. In an array,
 * , of size , each memory location has some unique index, (where ), that can be referenced as or
 * .Reverse an array of integers.
 *
 * Input Format
 * The first line contains an integer, , the number of integers in .
 * The second line contains space-separated integers that make up .
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
        }
        scan.close();

        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}