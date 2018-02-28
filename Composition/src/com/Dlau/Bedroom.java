package com.Dlau;

/**
 * Created by Daniel on 21/08/2017.
 */
public class Bedroom {
    private Size size;
    private Windows windows;
    private Door door;
    private Wardrobe wardrobe;
    private Desk desk;

    public Bedroom(Size size, Windows windows, Door door, Wardrobe wardrobe, Desk desk) {
        this.size = size;
        this.windows = windows;
        this.door = door;
        this.wardrobe = wardrobe;
        this.desk = desk;
    }

    public void openDoorsAndWindows(){
        windows.openWindow();
        door.openDoor();
        System.out.println("Doors and windows have been opened");
    }

    public void closeDoorsAndWindows() {
        windows.closeWindow();
        windows.closeWindow();
        System.out.println("Doors and windows have been closed");
    }

    public Size getSize() {
        return size;
    }

    public Windows getWindows() {
        return windows;
    }

    public Door getDoor() {
        return door;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Desk getDesk() {
        return desk;
    }
}
