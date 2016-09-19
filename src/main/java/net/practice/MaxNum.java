package net.practice;

import java.util.List;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
       /* System.out.println("Please enter number1 : ");
        numbers[0] = input.nextInt();
        System.out.println("Please enter number2 : ");
        numbers[1] = input.nextInt();
        System.out.println("Please enter number3 : ");
        numbers[2] = input.nextInt();
        System.out.println("Please enter number4 : ");
        numbers[3] = input.nextInt();
        System.out.println("Please enter number5 : ");
        numbers[4] = input.nextInt();*/
        for(int i =0;i<5;i++){
            System.out.println("Please enter number" +(i+1));
            numbers[i] =input.nextInt();

        }

        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println(largest + " & " + smallest);

    }
}
