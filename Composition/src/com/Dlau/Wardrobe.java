package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Wardrobe {
    private int doors;
    private int drawers;
    private String model;

    public Wardrobe(int doors, int drawers, String model) {
        this.doors = doors;
        this.drawers = drawers;
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public int getDrawers() {
        return drawers;
    }

    public String getModel() {
        return model;
    }
}
