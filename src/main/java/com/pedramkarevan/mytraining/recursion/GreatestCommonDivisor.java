package com.pedramkarevan.mytraining.recursion;

/**
 * The largest positive integer that divides the numbers without a reminder
 * gcd(48,18)
 * 1- 48/18=2 reminder 12
 * 2- 18/12=1 reminder 6
 *    12/6=2 remider 0
 */
public class GreatestCommonDivisor {
    public static void main(String[] args){
        GreatestCommonDivisor greatestCommonDivisor=new GreatestCommonDivisor();
        int result =greatestCommonDivisor.gcdOperation(8,-12);
        System.out.println(result);
    }


    /**
     * gcd(a,0)=a
     * gcd(a,b)=gcd(b,a mod b)
     */
    public int gcdOperation(int a, int b){
        if (a<0 ||b<0)
            return -1;
        if (b==0)
            return a;
        return gcdOperation(b, a%b);
    }
}
