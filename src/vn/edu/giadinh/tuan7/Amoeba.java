package vn.edu.giadinh.tuan7;

public class Amoeba {
    String sound; // .hif

    int x;
    int y;

    public Amoeba() {
    }

    public Amoeba(String s) {
        sound = s;
    }

    public Amoeba(String s, int xx, int yy) {
        sound = s;
        x = xx;
        y = yy;
    }

    void rotate() {

        // code xử lý cho các hình xoay 360
        // giống kim đồng hồ;
        // 1. xác tọa độ x, y
        // 2. xoay theo x, y
        System.out.println("xoay theo tọa độ x = " + x + " và y = " + y);
    }

    void playSound() {

        // code xử lý file.hif để phát ra âm thanh
        // của 1 tập tin .hif

        // khác với code xử lý file .aif

        System.out.println("Phát ra file âm thanh có tên: " + sound);
    }
}
