package vn.edu.giadinh.tuan6;

public class Dog {
    private String color;
    private String breed;
    private int age;
    private int size;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public Dog() {
    }

    public void bark() {
        System.out.println("Grrr Grrr Grrr !!!");
    }

    Dog(String b, int a, String c) {
        breed = b;
        age = a;
        color = c;

    }

    void duoiMeo() {
        System.out.println("đuổi mèo...");

    }

    void bark(int numberofBark) {
        while (numberofBark > 0)
            System.out.println("Grrr Grrr Grrr");
        numberofBark--;
    }

    public void setSize(int s) {
        // lý luận trong đây
        // chặn không chấp nhận các giá trị bất hợp lý
        if (s <= 0) {
            System.out.println("Cân nặng của chó không hợp lệ!!!");
        } else {
            size = s;
        }
    }

    public int getSize() {
        return size;

    }
}
