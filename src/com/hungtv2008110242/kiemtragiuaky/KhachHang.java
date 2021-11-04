package com.hungtv2008110242.kiemtragiuaky;

import java.util.Scanner;

public class KhachHang extends Nguoi {
    private String tenCongTy;
    private String triGiaHoaDon;

    public KhachHang() {

    }

    public KhachHang(String tenCongTy, String triGiaHoaDon) {
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(int i) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    public String toString() {
        String s;
        s = "\nTên khách hàng : " + getHoTen() + "\n" + "Địa chỉ : " + getDiaChi() + "\nTên công ty : " + getTenCongTy()
                + "\n" + "Trị giá đơn hàng : " + getTriGiaDonHang();
        return s;
    }

    private String getTriGiaDonHang() {
        return null;
    }

    public void xuatThongTinKhachHang() {
        System.out.println("Tên Công Ty: " + tenCongTy);
        System.out.println("Trị Giá Hóa Đơn: " + triGiaHoaDon);
        System.out.println("=================");
    }

    public void nhapThongTinKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Công Ty:");
        tenCongTy = scanner.nextLine();
        System.out.println("Trị giá hóa đơn: ");
        triGiaHoaDon = scanner.nextLine();
    }
}
