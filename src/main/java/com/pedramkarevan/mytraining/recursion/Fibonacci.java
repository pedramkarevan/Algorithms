package com.pedramkarevan.mytraining.recursion;

/**
 * f(n)=f(n-1)+f(n-2)
 */
public class Fibonacci {
    public static void main(String[] args){
    Fibonacci fibo=new Fibonacci();
    int fiboResult=fibo.fibonacci(5);
    }

    /**
     * the flow : 5=3+2  f(n)=f(n-1)+f(n-2)
     * Base case : 0 and 1 : f(0)=0 , f(1)=1
     * Only for positive numbers
     * @param n
     * @return
     */
    public int fibonacci(int n){
        if(n<0)
            return -1;
        if(n==0 || n==1)
            return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
