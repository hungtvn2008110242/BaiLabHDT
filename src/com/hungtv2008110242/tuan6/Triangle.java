package com.hungtv2008110242.tuan6;

public class Triangle {
    public static void main(String[] args) {
        Triangle hinhTamGiac = new Triangle();
        hinhTamGiac.xoay();
        hinhTamGiac.phatAmthanh();
    }

    String amThanh = "Sound Triangle.AIF ";
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
