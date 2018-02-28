package com.Dlau;

/**
 * Created by Daniel on 20/08/2017.
 */
public class Car {

    private int doors;
    private int windows;
    private int wheels;
    private String model;

    private int currentVelocity;
    private int currentDirection;

    public Car(int doors, int windows, int wheels, String model) {
        this.doors = doors;
        this.windows = windows;
        this.wheels = wheels;
        this.model = model;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Car.steer(): Sterring at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Car.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getWheels() {
        return wheels;
    }
}
