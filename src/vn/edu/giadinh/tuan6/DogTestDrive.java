package vn.edu.giadinh.tuan6;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog dog = new Dog();
        String name = "Shiba Inu";
        int age = 1;
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        dog.bark();

        Dog dog2 = new Dog("Kaka", 2);
        System.out.println("Tên: " + dog2);
        System.out.println("Tuổi: " + dog2);
        dog2.bark();
    }
}
