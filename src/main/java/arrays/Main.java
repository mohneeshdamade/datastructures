package arrays;

import arrays.primenumber.SieveOfEratosthenes;

public class Main {

	public static void main(String[] args) {
		SieveOfEratosthenes soe = new SieveOfEratosthenes();
		long startTime = System.currentTimeMillis();
		soe.printPrime(50);
		long endTime = System.currentTimeMillis();

		System.out.println("\nTime elapsed in milliseconds : " + (endTime-startTime));
		System.out.println("\nTime elapsed seconds : " + (endTime-startTime)/3600);

	}

}
