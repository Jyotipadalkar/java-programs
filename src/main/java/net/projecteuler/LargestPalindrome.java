package net.projecteuler;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class LargestPalindrome {
    public static void main(String[] args) {
        int result ;

        for (int num1 = 100; num1 <= 999; num1++) {
            for (int num2 = 100; num2 <= 999; num2++) {
                result = num1 * num2;
                if (iPalindrome(result)){
                    System.out.println("Numbers are palindrome: " + result);
                }
            }
        }
    }


    private static boolean iPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }


        if (number == reverse) {
            return true;
        }
        return false;
    }

}

