package com.hungtv2008110242.Lab4;

public class cow {
    int age;
    int weight;

    void Cow(int year, int amount) {
        age = year;
        weight = amount;
    }

    void showData() {
        System.out.println("Số tuổi: " + age);
        System.out.println("Cân nặng: " + weight + " Kg");
    }

    void moo(String text) {
        switch (text) {
            case "hello":
                System.out.println("Moo Mooooo Mo");
                break;

            default:
                System.out.println("Se cap nhat them !!!");
        }
    }

    public void keu() {
    }

    public void an() {
    }
}
