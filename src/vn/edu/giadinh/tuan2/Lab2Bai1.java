package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class Lab2Bai1 {
    public static void main(String[] args) {
        System.out.println("nhap he so a,b:");
        Float a,b;
        java.util.Scanner heso = new Scanner(System.in);
         a = heso.nextFloat();
         b = heso.nextFloat();
        if (a==0){
            if(b==0){
                System.out.println("phuong trinh vo so nghiem!");
            }
            else{
                System.out.println("phuong trinh vo nghiem!");
            }
        }
        else {
            System.out.println("phuong trinh co nghiem la x="+ -b/a);
        }
    }
}