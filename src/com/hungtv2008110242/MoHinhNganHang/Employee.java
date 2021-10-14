package com.hungtv2008110242.MoHinhNganHang;

import java.util.Scanner;

public class Employee {
    int name;
    int salary;
    int soLuongNhanVien;

    void Emloyee(int n) {
        soLuongNhanVien = n;
    }

    void getName() {
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.print("Nhập tên của nhân viên STT " + (i + 1) + " : " + name);
            Scanner input = new Scanner(System.in);
            input.nextLine();
        }
    }

    void getSalary() {
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.print("Nhập lương của nhân viên STT " + (i + 1) + " : " + salary);
            Scanner input = new Scanner(System.in);
            input.nextFloat();
        }
    }

    void printInfomationEmployee() {
        for (int i = 0; i < soLuongNhanVien; i++) {
            System.out.println("Tên nhân viên là : " + name);
            System.out.println("Lương nhân viên là : " + salary);
        }
    }
}
