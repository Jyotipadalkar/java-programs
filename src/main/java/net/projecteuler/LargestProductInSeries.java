package net.projecteuler;

public class LargestProductInSeries {
    /*

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/
    public static void main(String[] args) {

        for (int c = 1; c <= 998; c++) {
            for (int b = 1; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if (a * a + b * b == c * c && a+b+c==1000) {
                        System.out.printf("Triplet is: %d %d %d\n Product is: %d \n", a, b, c,a*b*c);
                    }
                }
            }
        }

    }
}
