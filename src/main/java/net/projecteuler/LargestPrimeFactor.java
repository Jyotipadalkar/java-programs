package net.projecteuler;

public class LargestPrimeFactor {
    /*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/
    public static void main(String[] args) {
        long number = 10;
        long tmp = 0;
        for(long i =2;i<=number/2;i++){

            if(isPrime(i)){
                 tmp = i;

            }
        }
        System.out.println("Prime Factor are : " +tmp);

    }

    private static boolean isPrime(long number) {
        //number =600851475143l;
        for(long j =2;j<number;j++){
            if(number%j==0){
                return false;
            }
        }
        return true;

    }


}
