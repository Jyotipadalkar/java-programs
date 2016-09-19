package net.projecteuler;

import java.util.Scanner;

class SumOfMultipliers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Multiplier1 is: ");
        int multiplier1 = input.nextInt();

        System.out.println("Multiplier2 is ");
        int multiplier2 = input.nextInt();

        System.out.println("Limit is: ");
        long limit = input.nextInt();


        long sum = 0;
        int number = 0;
        while (number < limit) {
            if (number % multiplier1 == 0 || number % multiplier2 == 0) {
                sum += number;
            }
            number++;
        }
       System.out.println("sum of no's that are multiple of " +multiplier1 + " & "   + multiplier2  + " is " + sum);
        //System.out.printf("Sum of numbers that are multiple of %d and %d is %d", multiplier1, multiplier2, sum);
    }

}
