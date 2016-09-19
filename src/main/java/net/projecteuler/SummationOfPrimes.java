package net.projecteuler;

public class SummationOfPrimes {
    /*

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/
    public static void main(String[] args) {
        long number = 2_000_000;
        long sum =0;
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
//                System.out.println(i);
                sum +=i;

            }
        }
        System.out.println("Sum is : " +sum);
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
