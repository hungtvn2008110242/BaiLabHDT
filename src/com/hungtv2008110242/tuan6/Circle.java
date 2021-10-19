package com.hungtv2008110242.tuan6;

public class Circle {
    public static void main(String[] args) {
        Circle tron = new Circle();
        tron.xoay();
        tron.phatAmthanh();
    }

    String amThanh = "Sound Circle.AIF ";
    boolean click = false;

    void xoay() {
        System.out.println("xoay 360, nguoc lai ");
        click = true;
    }

    void phatAmthanh() {
        if (click == true) {
            System.out.println("Am thanh dang phat: " + amThanh);
            System.out.println(" ====Ket thuc====");
        } else
            System.out.println("Error!!!");

    }
}
