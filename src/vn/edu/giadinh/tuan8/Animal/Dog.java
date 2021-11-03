package vn.edu.giadinh.tuan8.Animal;

public class Dog extends Canine {
    protected void makeNoise() {
        System.out.println("Gâu gâu gâu...");
    }

    protected void eat() {
        System.out.println("Chó đang ăn...");
    }

    protected void chaseCat() {
        System.out.println("Đuổi mèo...");
    }
}
