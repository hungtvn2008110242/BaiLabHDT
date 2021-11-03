package vn.edu.giadinh.tuan7.inheritance;

public class Animal {
    String sound;// tên file âm thanh dành cho các loài khác nhau

    protected String picture;

    protected String food;

    protected String location;

    protected String boundaries;

    protected String hunger;

    protected void makeNoise() {
        // code xử lý phát ra tiếng kêu
        // System.out.println("Phát ra tiếng kêu: " + sound);
        System.out.println("Đang kêu....");
    }

    protected void eat() {
        System.out.println("Đang ăn..");
    }

    protected void sleep() {
        System.out.println("Đang ngủ...");
    }

    protected void roam() {
        System.out.println("Đang đi lang thang...");
    }
}
