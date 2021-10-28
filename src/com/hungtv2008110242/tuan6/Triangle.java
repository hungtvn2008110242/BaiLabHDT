package com.hungtv2008110242.tuan6;

import com.hungtv2008110242.tuan7.inheritance.Shape;

public class Triangle extends Shape {
    public static void main(String[] args) {
        Triangle hinhTamGiac = new Triangle();
        hinhTamGiac.rotate();
        hinhTamGiac.playSound();
    }

    String amThanh = "Sound Triangle.AIF ";
    boolean click = false;

    public void rotate() {
        System.out.println("xoay 360, nguoc lai ");
        click = true;
    }

    public void playSound() {
        if (click == true) {
            System.out.println("Am thanh dang phat: " + amThanh);
            System.out.println(" ====Ket thuc====");
        } else
            System.out.println("Error!!!");

    }

}
