package com.pedramkarevan.mytraining.recursion;

/**
 * Find the sum of digits of a positive number
 * 10 10/10=1 and Reminder=0
 * 54 54/10=5 and Reminder=4
 * 112 112/10=11 and Reminder=2
 */
public class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int sumResult = sumOfDigits.sumOperation(111);
        System.out.println("Sum of digits:" + sumResult);
    }

    /**
     * n%10 + f(n/10)
     * n=0
     * sumOperation(-) return 0
     * @param n
     * @return sum of digits
     */
    public int sumOperation(int n) {
        if (n == 0 || n < 0)
            return 0;
        return n % 10 + sumOperation(n / 10);

    }
}
