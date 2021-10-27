package com.hungtv2008110242.tuan7;

import java.security.PrivateKey;

public class Animal {
    private String picture;
    private String food;
    private String hunger;
    private String boundaries;
    private String location;

    protected void makeNoise() {
        System.out.println("Dang keu");
    }

    protected void eat() {
        System.out.println("Dang an");
    }

    protected void sleep() {
        System.out.println("Dang ngu!!!");
    }

    protected void roam() {
        System.out.println("Dang Di dao ");
    }

}
