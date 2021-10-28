package com.hungtv2008110242.tuan7.inheritance;

public class Amoeba extends ShapeTestDrive {

    int x;
    int y;
    private static String sound;

    public Amoeba() {
    }

    public Amoeba(String s) {
        super(s);
        sound = s;
    }

    public Amoeba(String s, int xx, int yy) {
        this(s);
        sound = s;
        this.x = xx;
        this.y = yy;
        this.playSound();

    }

    void rotate() {

        // code xử lý cho các hình xoay 360
        // giống kim đồng hồ;
        // 1. xác tọa độ x, y
        // 2. xoay theo x, y
        System.out.println("xoay theo tọa độ x = " + x + " và y = " + y);

        this.x = 10;
    }

    public void playSound() {

        // code xử lý file.hif để phát ra âm thanh
        // của 1 tập tin .hif

        // khác với code xử lý file .aif

        System.out.println("Phát ra file âm thanh có tên: " + sound);
    }
}
