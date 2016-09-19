package net.projecteuler;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of circle");
        int radius = input.nextInt();

        double area = 3.14 * radius*radius;
        System.out.println("Area of circle is " +area);

        double parameter = 2*3.14*radius;
        System.out.println("Parameter of Circle is : " +parameter);



    }

}