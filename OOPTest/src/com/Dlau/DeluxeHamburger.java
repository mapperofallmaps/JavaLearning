package com.Dlau;

/**
 * Created by Daniel on 22/08/2017.
 */
public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super(14.5, "White", "Sausage & Bacon", "Deluxe");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to Deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to Deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to Deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to Deluxe");
    }
}
