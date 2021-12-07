package com.pedramkarevan.mytraining.recursion;

/**
 * 13 to binry
 * 13/2 quotient is 6 and reminder is 1
 * So, 6/2 quotient is 3 and reminder is 0
 *  3/2 quotient is 1 and reminder is 1
 *  1/2 quotient is 0 and reminder is 1: Repeat until quotient is equal to zero
 */
public class DecimalToBinary {
    public static void main(String[] args){
        DecimalToBinary decimalToBinary=new DecimalToBinary();
        int result= decimalToBinary.decimalToBinary(13);
        System.out.println(result);
    }

    /** f(n)=n mod 2 + 10 * f(n/2)
     *Repeat until quotient is equal to zero
     */
    public int decimalToBinary(int n){
        if (n==0){
            return 0;
        }
        return n%2+10*decimalToBinary(n/2);
    }
}
