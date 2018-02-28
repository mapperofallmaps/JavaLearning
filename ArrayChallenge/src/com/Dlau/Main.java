package com.Dlau;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of integers:");
        int numIntegers = scanner.nextInt();
        int[] sortArray = getIntegers(numIntegers);
        printArray(sortArray);
        int[] sortedArray = sortIntegers(sortArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int numIntegers) {
        System.out.println("Enter " + numIntegers + " integers :");
        int[] values = new int[numIntegers];
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] intArray) {
        System.out.println("Array contents are: ");
        for(int i=0; i <intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray) {
        int temp;
        for(int i=0; i <(intArray.length -1); i++) {
            for(int j=0; j <(intArray.length - i -1); j++) {
                if(intArray[j] < intArray[j+1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        return intArray;
    }
}
