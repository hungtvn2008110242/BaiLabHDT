package vn.edu.giadinh.tuan7.inheritance;

public class Canine extends Animal {
    // thuộc họ Chó
    protected void makeNoise() {
        System.out.println("Đang kêu.....");
    }

    protected void roam() {
        System.out.println("Đi theo bầy đàn...");
        // tập tính đi săn theo đàn
    }
}
