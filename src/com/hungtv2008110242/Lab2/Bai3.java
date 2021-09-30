package com.hungtv2008110242.Lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("nhap so dien su dung:");
        Scanner tiendien = new Scanner(System.in);
        int diensd = tiendien.nextInt();
        if (diensd <= 50 && diensd<0){
            System.out.println("so tien dien la"+ diensd*1000);
        }
        if (diensd>0) {
            System.out.println("so tien dien la"+ 50*1000+(diensd-50)*1200);
    }
    }
}