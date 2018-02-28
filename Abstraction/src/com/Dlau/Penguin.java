package com.Dlau;

/**
 * Created by Daniel on 6/09/2017.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Can't fly, can swim instead");
    }
}
