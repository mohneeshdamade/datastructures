package arrays;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is not a prime number");
            System.exit(0);
        }

        if (number <= 1) {
            System.out.println(number + " is not a prime number");
        } else {
            int pivot = number / 2;
            for (int i = 2; i <= pivot; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");
                    System.exit(0);
                }
            }

            System.out.println(number + " is a prime number");
        }
    }
}
