package vn.edu.giadinh.tuan8.Animal;

public class Lion extends Feline {
    protected void makeNoise() {
        System.out.println("Sư tử đang kêu...");
    }

    protected void eat() {
        System.out.println("Sư tử đang ăn...");
    }

    protected void sleep() {
        System.out.println("Sư tử đang ngủ...");
    }

    protected void roam() {
        System.out.println("Sư tử đang đi dạo...");
    }

    public void goHunting() {
    }

}