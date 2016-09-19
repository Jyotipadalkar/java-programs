package net.projecteuler;

public class SumOfSquares {
    /*

    The sum of the squares of the first ten natural numbers is,
    12 + 22 + ... + 102 = 385

    The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)2 = 552 = 3025

    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    */
    public static void main(String[] args) {
        int sumOfNumber = 0;
        int sumOfSquares = 0;
        int difference = 0;
        for (int number = 1; number <= 100; number++) {
            sumOfSquares  += number * number;
            sumOfNumber += number;
        }
        System.out.println(" Sum of squares of first hundred number is : " + sumOfSquares);
        System.out.println("Square of Sum of first hundred number is : " + sumOfNumber * sumOfNumber);
        difference = (sumOfNumber * sumOfNumber) - sumOfSquares;
        System.out.println("Difference is : " + difference);

    }

}