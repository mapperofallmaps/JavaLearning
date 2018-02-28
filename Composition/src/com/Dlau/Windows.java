package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Windows {
    private String shape;
    private boolean open;

    public Windows( String shape, boolean open) {
        this.shape = shape;
        this.open = open;
    }

    public void openWindow() {
        this.open = true;
        System.out.println("Window has been opened");
    }

    public void closeWindow() {
        this.open = false;
        System.out.println("Window has been closed");
    }

    public String getShape() {
        return shape;
    }

    public boolean isLock() {
        return open;
    }
}
