package com.Dlau;

public class Main {

    public static void main(String[] args) {

        byte i = 5;
        short j = 10;
        int k = 20;

        long l = 50000L + 10L * (i + j + k);
        short s = (short)(1000 + 19 * (i + j + k));

        System.out.println("longTotal = " + l);
        System.out.println("shortTotal =" + s);

    }
}
