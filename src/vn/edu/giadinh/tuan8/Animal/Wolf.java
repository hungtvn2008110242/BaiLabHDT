package vn.edu.giadinh.tuan8.Animal;

public class Wolf extends Canine {
    @Override
    protected void makeNoise() {
        System.out.println("grauuuu húuuuuuuuuuu........");
    }

    @Override
    protected void eat() {
        System.out.println("Ăn bình thường....");
    }

    @Override
    protected void roam() {
        System.out.println("Đi săn mồi.....");
    }
}
