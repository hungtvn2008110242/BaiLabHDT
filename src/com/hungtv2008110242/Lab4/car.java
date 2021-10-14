package com.hungtv2008110242.Lab4;

import java.util.Scanner;

public class car {
    String tenChuXe, hangSanXuat, dong;
    Boolean giayPhep;
    float dungTichXang;
    Scanner tenchuxe = new Scanner(System.in);
    Scanner hangsx = new Scanner(System.in);
    Scanner dongxe = new Scanner(System.in);
    Scanner giayphep = new Scanner(System.in);
    Scanner dungtichxang = new Scanner(System.in);

    void inThongTinXe() {
        System.out.println("Tên chủ xe : " + tenchuxe);
        System.out.println("Hảng sản xuất : " + hangsx);
        System.out.println("Dòng xe : " + dongxe);
        System.out.println("Giấy phép : " + giayphep);
        System.out.println("dung tích xăng : " + dungtichxang);

    }
}
