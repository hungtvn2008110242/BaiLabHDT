package com.hungtv2008110242.kiemtragiuaky;

import java.util.Scanner;

public class NhanVien extends Nguoi {
    private float heSoLuong;

    public NhanVien() {

    }

    public NhanVien(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getHeSoLuong(int i) {
        return heSoLuong;
    }

    public void setHeSoLuong() {
        this.heSoLuong = heSoLuong;
    }

    public double getPhuongThucTinhLuong() {
        double luong;
        luong = heSoLuong * 1500000;
        return luong;
    }

    public void xuatThongTinNhanVien() {
        System.out.println("Hệ Số Lương: " + heSoLuong);
        System.out.println("Phương thức tính lương: " + getPhuongThucTinhLuong());
        System.out.println("=================");
    }

    public void nhapThongTinNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số lương:");
        heSoLuong = scanner.nextFloat();
    }
}
