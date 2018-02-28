package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Motherboard {

    private String model;
    private String manufacturer;
    private int ratSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ratSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ratSlots = ratSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRatSlots() {
        return ratSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
