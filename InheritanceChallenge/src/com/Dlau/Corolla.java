package com.Dlau;

/**
 * Created by Daniel on 20/08/2017.
 */
public class Corolla extends Toyota {
    private int roadServiceMonths;

    public Corolla(int roadServiceMonths) {
        super(4, 6, 4, "Corolla", 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            changeGear(1);
        } else if(newVelocity >0 && newVelocity <=10) {
            changeGear(1);
        } else if(newVelocity >10 && newVelocity <=20) {
            changeGear(2);
        } else if(newVelocity >20 && newVelocity <=30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVelocity >0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
