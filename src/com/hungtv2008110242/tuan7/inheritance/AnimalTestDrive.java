package com.hungtv2008110242.tuan7.inheritance;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion suTu = new Lion();
        suTu.makeNoise();
        suTu.eat();
        suTu.roam();
        suTu.goHunting();

        Dog cho = new Dog();
        cho.eat();
        cho.makeNoise();
        cho.sleep();
        cho.roam();
        cho.chaseCat();

        Cat meo = new Cat();
        meo.eat();
        meo.roam();
        meo.makeNoise();
        meo.chaseMouse();
    }

}
