package com.Dlau;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
