package com.hungtv2008110242.tuan7.inheritance;

public class Shape {

    private String sound; // .hif

    public void rotate() {
        // code xử lý các hình xoay 360
        // giống kim đồng hồ
        // 1. xác định tâm
        // 2. xoay theo tâm
        System.out.println("xoay 360, nguoc lai ");
    }

    public void playSound() {
        // code xử lý file .aif để phát ra âm thanh
        // của 1 tập tin.aif
        System.out.println("Am thanh dang phat: " + sound);

    }

}
