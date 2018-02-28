package com.Dlau;

/**
 * Created by Daniel on 22/08/2017.
 */
public class Hamburger {
    private double price;
    private String rollType;
    private String meat;
    private String name;
//    private int lettuce;
//    private int tomato;
//    private int carrot;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(double price, String rollType, String meat, String name) {
        this.price = price;
        this.rollType = rollType;
        this.meat = meat;
        this.name = name;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a " + this.rollType +
                " roll with " + this.meat + ", price is " + this.price);
        if (this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}
//    public void addLettuce(int amount) {
//        this.lettuce += amount;
//        this.price += (amount * 0.5);
//        System.out.println(amount + " lettuce has been added \n" +
//                "price of the burger is now " + this.price);
//    }
//
//    public void addTomato(int amount) {
//        this.tomato += amount;
//        this.price += (amount * 0.3);
//        System.out.println(amount + " tomatoes has been added \n" +
//                "price of the burger is now " + this.price);
//    }
//
//    public void addCarrot(int amount) {
//        this.carrot += amount;
//        this.price += (amount * 0.4);
//        System.out.println(amount + " carrots has been added \n" +
//                "price of the burger is now " + this.price);
//    }

