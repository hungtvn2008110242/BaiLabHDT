package com.hungtv2008110242.tuan5;

public class testdrive<Computer> {

    public static void main(String[] args) {

        book sach = new book();
        sach.nhapThongTinSach();
        sach.xuatThongTinSach();
        System.out.println("------------------------");
        nhanvien nhanvien = new com.hungtv2008110242.tuan5.nhanvien();
        nhanvien.nhapThongTinNhanVien();
        nhanvien.xuatThongTinNhanVien();
        System.out.println("-------------------------");
        car xemoiCar = new car();
        xemoiCar.inThongTinXe();
        System.out.println("--------------------------");
        computer maytinhmoi = new computer();
        maytinhmoi.inThongTinMayTinh("HP", "Window", "i5-6200U", 2017, 8, 2021, 85000000);
        System.out.println("-------------------------------");
        account taikhoanmoi = new account();
        taikhoanmoi.deposite(200000);
        taikhoanmoi.Withdraw(20000);
        taikhoanmoi.Show_Balance();
        System.out.println("-------------------------");
        cow boCon = new cow();
        boCon.keu();
        boCon.an();
        System.out.println("-------------------------");

    }
}
