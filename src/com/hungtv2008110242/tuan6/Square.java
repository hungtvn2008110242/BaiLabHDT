package com.hungtv2008110242.tuan6;

public class Square {
    public static void main(String[] args) {
        Square hinhvuong = new Square();
        hinhvuong.xoay();
        hinhvuong.phatAmthanh();
    }

    String amThanh = "Sound Square.AIF ";
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
