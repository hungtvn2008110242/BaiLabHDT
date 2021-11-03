package com.hungtv2008110242.Lab4;

public class NangCapSanPhamTestDrive {
    public static void main(String[] args) {
        NangCapSanPham spGiamGia = new NangCapSanPham("Bút chì màu", 10000, 5000);
        NangCapSanPham spKhongGiamGia = new NangCapSanPham("Sách giáo khoa", 20000);

        spGiamGia.xuat();
        spKhongGiamGia.xuat();
    }
}
