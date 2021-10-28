package com.hungtv2008110242.tuan8;

public class Wolf extends Feline {

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
