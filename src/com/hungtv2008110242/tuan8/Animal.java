package com.hungtv2008110242.tuan8;

public class Animal {
    protected String sound;// tên file âm thanh dành cho các loài

    protected String pictire;

    protected String food;

    protected String hunger;

    private String name;

    // location

    // boundaries

    public Animal(String n) {
        name = n;
    }

    public Animal() {
        // super()
        System.out.println("Making a Animal...");
    }

    protected void makeNoise() {
        // code xử lý phát ra tiếng kêu
        System.out.println("Hmmmm....");
    }

    protected void eat() {
        System.out.println("Ăn...");
    }

    protected void sleep() {
        System.out.println("Ngủ...");
    }

    protected void roam() {
        System.out.println("Đi lang thang...");
    }
}
