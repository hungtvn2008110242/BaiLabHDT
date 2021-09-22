package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class Lab1Bai1 {

    public static void main(String[] args) throws Exception {
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
