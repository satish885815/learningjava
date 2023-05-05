package org.example.problemsolving;

import java.util.Scanner;

public class PrimeNumber {
    /**
     * isPrime is method return truw if number is prime number
     * @param n
     * @return
     */
    static boolean  isPrime(int n){
        if(n<=1) return  false;
        if(n%2==0) return false;
        if(n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /**
         * taking input
         */
        System.out.print("Enter the number :");
        int num=s.nextInt();
        if(isPrime(num)){
            System.out.println("Number is Prime");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
