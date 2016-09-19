package net.practice;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter mark : ");
        int mark = input.nextInt();

        if(mark>=50){
            System.out.println("PASS");
        }if(mark<50) {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
}
