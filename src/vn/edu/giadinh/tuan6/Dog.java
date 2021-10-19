package vn.edu.giadinh.tuan6;

public class Dog {
    String color, name, breed;
    int tuoi;

    public void bark() {
        System.out.println("Grrr Grrr Grrr !!!");
    }

    Dog(String ten, int year) {
        name = ten;
        tuoi = year;
    }

    public Dog() {
    }

    void bark(int numberofBark) {
        while (numberofBark > 0)
            System.out.println("Grrr Grrr Grrr");
        numberofBark--;
    }

}
