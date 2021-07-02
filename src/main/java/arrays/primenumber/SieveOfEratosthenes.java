package arrays.primenumber;

import java.util.Arrays;

/**
 * @author mdamade
 * Program to print all prime numbers using Sieve of Eratosthenes.
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 * smaller than or equal to n
 *
 * Time complexity : O(n*log(log(n)))
 */
public class SieveOfEratosthenes {

    public void printPrime(int n){
        //Take a boolean array considering all numbers are prime at start and initialize it to true
        // A value in prime[i] will be false if i is not prime
        boolean [] prime = new boolean[n+1];

        //initialize all elements to true
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        // We need to check only until sqrt(n) since for it to be a prime number
        // at least one of its factors have to be less than or equal to sqrt(n)
        // p * p <=n or p<= sqrt(n)
        for (int p = 2; p <= Math.sqrt(n); p++) {

            //if prime[p] is not changed to False, it is prime
            if(prime[p] == true){
                //Update all multiples of p to false in the prime array
                for (int i = p * p; i <= n ; i+= p) {
                    prime[i] = false;
                }
            }
        }

        //print all primes
        for (int i = 2;i <= n; i++) {
            if(prime[i] ==true)
                System.out.print(i + " ");
        }

    }
}
