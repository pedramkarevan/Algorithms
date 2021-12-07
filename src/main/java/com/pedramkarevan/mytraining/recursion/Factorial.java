package com.pedramkarevan.mytraining.recursion;

/**
 * n!=n*(n-1)!
 */
public class Factorial {

    public static void main(String[] args) {
        Factorial fac= new Factorial();
        int factorialResult=fac.factorial(10);
        System.out.println("Factorial of number is :"+factorialResult);

    }

    /**
     * take as a parameter N and which will return N multiply with factorial of N
     * prevent infinite loop with base case
     * N should be positive number
     */

    public int factorial(int n) {
        if (n<0)
            return -1;
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
