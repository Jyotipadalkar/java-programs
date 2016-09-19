package net.projecteuler;

public class SmallestNumber {
    /*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


*/
    public static void main(String[] args) {
        int number = 1;
        boolean found = false;

        while (!found) {
            if (isEvenlyDivisible(number)) {
                System.out.println(number);
                found = true;
            }
            number++;

        }
    }

    private static boolean isEvenlyDivisible(int number) {

        for (int i = 2; i <= 20; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;
    }
}
