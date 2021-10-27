package com.hungtv2008110242.tuan7.inheritance;

public class Felidae extends Animal {
    // thú nhà họ Mèo
    protected void makeNoise() {
        System.out.println("Đang kêu ......");
    }

    protected void roam() {
        System.out.println("Đi tìm thức ăn...");
        // có tập tính đi săn 1 mình
    }
}
