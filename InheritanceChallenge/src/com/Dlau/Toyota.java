package com.Dlau;

/**
 * Created by Daniel on 20/08/2017.
 */
public class Toyota extends Car {

    private int gears;
    private boolean isManual;

    private int currentGear;

    public Toyota(int doors, int windows, int wheels, String model, int gears, boolean isManual) {
        super(doors, windows, wheels, model);
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }


}
