package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Door {
    private int height;
    private int width;
    private String model;

    public Door(int height, int width, String model) {
        this.height = height;
        this.width = width;
        this.model = model;
    }

    public void openDoor() {
        System.out.println("Door has been opened");
    }

    public void close() {
        System.out.println("Door has been closed");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getModel() {
        return model;
    }
}
