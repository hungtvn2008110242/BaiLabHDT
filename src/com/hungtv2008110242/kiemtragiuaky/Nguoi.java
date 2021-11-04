package com.hungtv2008110242.kiemtragiuaky;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String diaChi;

    public Nguoi() {

    }

    public Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void xuatThongTin() {
        System.out.println("Họ Tên: " + hoTen);
        System.out.println("Địa Chỉ: " + diaChi);
        System.out.println("=======================");
    }

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
    }
}
