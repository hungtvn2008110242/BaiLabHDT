package vn.edu.giadinh.tuan5;

import java.util.Scanner;

public class book {
    Scanner giaban = new Scanner(System.in);
    Scanner nhasanxuat = new Scanner(System.in);
    Scanner tensach = new Scanner(System.in);
    Scanner namsanxuat = new Scanner(System.in);
    Scanner soluong = new Scanner(System.in);
    Scanner loaisach = new Scanner(System.in);

    void nhapThongTinSach() {
        System.out.print("Nhập tên sách : " + tensach);
        System.out.print("Nhập loại sách : " + loaisach);
        System.out.print("Nhập tên nhà xuất bản của sách : " + nhasanxuat);
        System.out.print("Nhập năm xuất bản của sách : " + namsanxuat);
        System.out.print("Nhập số lượng sách : " + soluong);
        System.out.print("Nhập giá sách :" + giaban);
    }

    void xuatThongTinSach() {
        System.out.println("Tên sách : " + tensach);
        System.out.println("Loại sách : " + loaisach);
        System.out.println("Tên nhà xuất bản của sách : " + nhasanxuat);
        System.out.println("Năm xuất bản của sách : " + namsanxuat);
        System.out.println("Số lượng sách : " + soluong);
        System.out.println("Giá sách :" + giaban);
    }
}
