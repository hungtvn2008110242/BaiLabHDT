package com.hungtv2008110242.MoHinhNganHang;

import java.util.Scanner;

public class Customer {
    int tenkhachhang;
    int diachikhachhang;
    int soLuongKhachHang;

    Customer(int n) {
        soLuongKhachHang = n;
    }

    void getName() {
        for (int i = 0; i < soLuongKhachHang; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("STT " + (i + 1) + " Nhập tên khách hàng : " + tenkhachhang);
            input.nextLine();
        }
    }

    void getAddress() {
        for (int i = 0; i < soLuongKhachHang; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập địa chỉ khách hàng thứ " + (i + 1) + " : " + diachikhachhang);
            input.nextLine();
        }
    }

    void printInformation() {
        for (int i = 0; i < soLuongKhachHang; i++) {
            System.out.println("STT" + (i + 1) + "Tên khách hàng : " + tenkhachhang);
            System.out.println("Địa Chỉ : " + diachikhachhang);
        }
    }
}
