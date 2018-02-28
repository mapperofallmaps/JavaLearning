package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <=0) {
            System.out.println("Player has been knocked out");
            // Reduce number of lives remaining for player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
