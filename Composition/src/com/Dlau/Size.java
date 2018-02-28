package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Size {
    private int length;
    private int width;
    private int height;
    private String shape;

    public Size(int length, int width, int height, String shape) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.shape = shape;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getShape() {
        return shape;
    }
}
