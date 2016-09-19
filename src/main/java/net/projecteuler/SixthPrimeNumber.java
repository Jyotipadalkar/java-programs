package net.projecteuler;

public class SixthPrimeNumber {
    /* By listing the first six prime number :2,3,5,7,11 and 13 we can see that the 6th prime is 13.
    * What is the 10001st prime number?*/
    public static void main(String[] args) {
        int counter = 0;
        int i = 1;
        while (counter < 10001) {
            if (isPrime(i)) {
                counter++;
                System.out.println("Counter is " + counter + " Number " + i);
            }
            i++;
        }
//        System.out.println(counter);
    }

    private static boolean isPrime(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        if (number <= 1) {
            return false;
        }
        return true;

    }
}
