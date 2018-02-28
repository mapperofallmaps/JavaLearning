package com.Dlau;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(3.56, "White", "Sausage", "Basic");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(5.43, "Bacon");
        healthyBurger.addHamburgerAddition1("Egg", 2.45);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println(healthyBurger.itemizeHamburger());

        DeluxeHamburger db = new DeluxeHamburger();
        db.itemizeHamburger();
        db.addHamburgerAddition1("Avocado", 4.3);
    }
}
