package com.Dlau;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        Size size = new Size(4, 5, 2, "Square");

        Desk desk = new Desk(1, 1, 1);

        Door door = new Door(2, 1, "normal");

        Wardrobe wardrobe = new Wardrobe(2, 4, "Wooden");

        Windows windows = new Windows("Rectangular", false);

        Bedroom bedroom = new Bedroom(size, windows, door, wardrobe, desk);
        bedroom.openDoorsAndWindows();
        bedroom.closeDoorsAndWindows();
        bedroom.getWindows().openWindow();
    }
}
