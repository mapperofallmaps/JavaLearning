package com.Dlau;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
        while(count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 5);

        int number = 5;
        int finishNumber = 20;
        int evenNumbers = 0;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbers++;
            number++;

            if(evenNumbers >= 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers found = " + evenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        boolean isEven;
        if(number % 2 != 0) {
            isEven = false;
        } else {
            isEven = true;
        }
        return isEven;
    }
}
