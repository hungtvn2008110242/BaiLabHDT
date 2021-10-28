package com.hungtv2008110242.tuan7.inheritance;

public class ShapeTestDrive {
    public ShapeTestDrive() {
    }

    public ShapeTestDrive(String s) {
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Circle.AIF");
        circle.rotate();
        circle.playSound();

        Square square = new Square("Square.AIF");
        square.rotate();
        square.playSound();

        Amoeba amoeba = new Amoeba("Amoeba.HIF ", 5, 10);
        amoeba.rotate();
        amoeba.playSound();

    }
}
