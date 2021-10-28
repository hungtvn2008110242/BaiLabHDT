package com.hungtv2008110242.tuan8;

public class Hippo extends Animal {

    public Hippo() {
        // super();
        System.out.println("Making a Hippo");
    }

    public Hippo(String n) {
        super(n);
    }

    @Override
    protected void makeNoise() {
        System.out.println("Kêu đói....");
        System.out.println("Hmmmmm....");
    }

    @Override
    protected void eat() {
        System.out.println("AAAAAA....");
    }

    @Override
    protected void roam() {
        System.out.println("Lười đi, đi chậm, thích ngâm trong nước...");
    }
}
