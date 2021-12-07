package com.pedramkarevan.mytraining.recursion;

/**
 * x power of n= x * x power of n-1
 */
public class PowerOfNumber {
    public static void main(String[] args) {
        PowerOfNumber powerOfNumber= new PowerOfNumber();
        int result=powerOfNumber.power(2,2);

    }

    /**
     * x power of n= x * x power of n-1
     * power of 0 is 1
     * any given number power of 1 is itself
     * n should be positive
     */
    public int power(int x, int n){
        if (n<0)
            return -1;
        if(n==0)
            return 1;
        return x * power(x,n-1);
    }
}
