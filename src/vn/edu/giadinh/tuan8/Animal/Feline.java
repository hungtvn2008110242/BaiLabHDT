package vn.edu.giadinh.tuan8.Animal;

public class Feline extends Animal {

    public Feline() {

    }

    // thú nhà họ Mèo
    protected void makeNoise() {
        System.out.println("Đang kêu ......");
    }

    @Override
    protected void roam() {
        System.out.println("Đi tìm thức ăn...");
        // có tập tính đi săn 1 mình
    }
}
