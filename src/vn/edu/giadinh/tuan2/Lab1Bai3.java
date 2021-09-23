package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Float Canh, TheTich;
        System.out.print("Nhap canh: ");
        Scanner input = new Scanner(System.in);
        Canh = input.nextFloat();
         TheTich= Canh *Canh*Canh;
        System.out.println("The tich cua hinh lap phuong la : " + TheTich);
    }
}
