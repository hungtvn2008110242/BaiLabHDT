package vn.edu.giadinh.tuan7.inheritance;

public class Lion extends Animal {
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
