package com.Dlau.mylibrary;

/**
 * Created by Daniel on 16/02/2018.
 */
public class Series {

    public static long nSum(int n) {
        return (n * (n + 1) / 2);
    }

    public static long factorial(int n) {
        if(n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static long fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        }
        long firstFib = 0;
        long secondFib = 1;
        long fib = 0;
        for (int i = 1; i < n; i++) {
            fib = (firstFib + secondFib);
            firstFib = secondFib;
            secondFib = fib;
        }
        return fib;
    }
}
