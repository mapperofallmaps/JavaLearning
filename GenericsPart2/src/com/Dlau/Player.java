package com.Dlau;

/**
 * Created by Daniel on 25/09/2017.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
