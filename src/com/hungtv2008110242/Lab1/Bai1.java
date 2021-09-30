package com.hungtv2008110242.Lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String name;
        Float mark;
       
        System.out.println("Nhap ten sinh vien:");
        Scanner ten = new Scanner(System.in);
        name = ten.nextLine();
       
        System.out.println("Nhap diem tb cua sinh vien:");
        Scanner diem = new Scanner(System.in);
        mark = diem.nextFloat();
       
        System.out.println("ten sinh vien:" + name + "\ndiem tb cua sinh vien:" + mark);
        
    }
    
}
