package com.hungtv2008110242.Lab4;

public class computer {
    String producer;
    String releaseYear;
    String os;
    int ram;
    String cpu;
    String price;
    String baoHanh;

    void Computer(String nhaSX, String namSX, String heDH, int r, String c, String gia, String bH) {
        producer = nhaSX;
        releaseYear = namSX;
        os = heDH;
        ram = r;
        cpu = c;
        price = gia;
        baoHanh = bH;
    }

    void show() {
        System.out.println("Nha san xuat: " + producer);
        System.out.println("Nam ra mat: " + releaseYear);
        System.out.println("He dieu hanh: " + os);
        System.out.println("Ram: " + ram);
        System.out.println("Cpu: " + cpu);
        System.out.println("Gia: " + price);
        System.out.println("Bao hanh: " + baoHanh);
    }

    public void inThongTinMayTinh(String string, String string2, String string3, int i, int j, int k, int l) {
    }
}
