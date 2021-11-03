package vn.edu.giadinh.tuan7.inheritance;

public class Dog extends Animal {
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
