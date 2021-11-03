package com.hungtv2008110242.Lab7;

public class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    public void xuat() {
        System.out.println("Cạnh: " + getDai());
        System.out.println("Chu vi hinh vuong = " + getChuVi());
        System.out.println("Dien tich hinh vuong = " + getDienTich());
    }
}
