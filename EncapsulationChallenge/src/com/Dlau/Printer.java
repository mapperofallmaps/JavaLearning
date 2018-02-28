package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if(this.tonerLevel >= 0 && this.tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillToner(int amount) {
        if(amount >0 && amount <=100){
            if(this.tonerLevel + amount >100) {
                System.out.println("Toner overfilled");
                return -1;
            }
            this.tonerLevel += amount;
            System.out.println("Toner level is at " + this.tonerLevel + " %");
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public void print(int pages) {
        int pagesToPrint = pages;
        if(this.duplexPrinter) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        System.out.println("Total pages printed = " + this.pagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
