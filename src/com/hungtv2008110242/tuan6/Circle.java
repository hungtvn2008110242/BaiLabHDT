package com.hungtv2008110242.tuan6;

public class Circle {
    public Circle(String string) {
    }

    public Circle() {
    }

    public static void main(String[] args) {
        Circle tron = new Circle(amThanh);
        tron.xoay();
        tron.phatAmthanh();
    }

    static String amThanh = "Sound Circle.AIF ";
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

    public void rotate() {
    }

    public void playSound() {
    }
}
