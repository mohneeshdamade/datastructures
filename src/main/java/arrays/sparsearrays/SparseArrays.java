package arrays.sparsearrays;

/**
 * There is a collection of input strings and a collection of query strings. For each query string,
 * determine how many times it occurs in the list of input strings. Return an array of the results.
 *
 * Example
 * There are 2 instances of 1,  of '' and  of ''. For each query, add an element to the return array, .
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Input Format
 *
 * The first line contains an integer n, the size of string[].
 * Each of the next n lines contains a strings[i] .
 * The next line contains q, the size of queries[].
 * Each of the next q lines contains a string queries[q].
 */
public class SparseArrays {

    public static void main(String args []){

        //Process input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strings[] = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
        }

        int q = sc.nextInt();
        String queries[] = new String[q];

        for (int j = 0; j < q; j++) {
            queries[j] = sc.next();
        }

        //Array holding results
        int [] results = new int[q];

        //Create a map of input strings and their occurrence in the input arrays
        Map<String,Integer> occurrences = new HashMap<>();
        for(String string : strings){
                int counter = 1;
                occurrences.put(string, occurrences.containsKey(string) ? occurrences.get(string) + 1 : counter);
        }

        for (int k = 0; k<q;k++){
            if (occurrences.containsKey(queries[k])){
                results[k] = occurrences.get(queries[k]);
            }
        }


        //print result
        for (int count:results) {
            System.out.println(count+" ");

        }



    }
}
