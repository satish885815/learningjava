package org.example.problemsolving;

import java.util.Scanner;

public class Gcd {
    /**
     * using recursion
     * @param a
     * @param b
     * @return
     */
    static int gcdRecursion(int a,int b){
        if(a==0) return b;
        return gcdRecursion(b%a,a);
    }


    static int gcd(int a,int b){
        while (a!=b){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1=s.nextInt();
        System.out.print("Enter Second number :");
        int num2=s.nextInt();
        int result1=gcdRecursion(num1,num2);
        System.out.println("The GCD of number using recursion :"+result1);
        int result2=gcd(num1,num2);
        System.out.println("The GCD of number without using recursion :"+result2);
    }
}
