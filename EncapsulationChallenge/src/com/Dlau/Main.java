package com.Dlau;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, 25, true);
        printer.fillToner(9);
        printer.print(6);
        printer.fillToner(50);
        printer.print(134);
    }
}
