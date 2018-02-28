package com.Dlau;

import java.util.Scanner;

public class Main {


    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double a = 0;
        a = calculate(9);
        System.out.println(a);

        int i = Scann
    }

    public static double calculate(double a) {
        if (a <= 2) {
            return 1;
        } else {
            System.out.println("run\n");
            return (calculate(Math.floor(Math.sqrt(a)) + a));
        }
    }
}
