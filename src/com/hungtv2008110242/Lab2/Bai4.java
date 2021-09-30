package com.hungtv2008110242.Lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("===========MENU============");
        System.out.println("1.giai phuong trinh bac I");
        System.out.println("2.giai phuong trinh bac II");
        System.out.println("3. tinh tien dien");
        System.out.println("==========END MENU=========");

         System.out.println("hay chon 1 chuc nang:");
         Scanner bienNhap = new Scanner(System.in);
         int giatriNhap = bienNhap.nextInt();

        switch(giatriNhap){   
            case 1: giaiPTBac1();; break;
            case 2: giaiPTBacII();; break;
            case 3: tinhtiendien();; break;
            default: System.out.println("chon chuc nang khac");
        }

    }
    
    static void giaiPTBac1(){
        System.out.println("cai dat code giai phuong trinh bac I");
    }

    static void giaiPTBacII(){
        System.out.println("cai dat code giai phuong trinh bac II");
    }

    static void  tinhtiendien(){
        System.out.println("cai dat code tinh tien dien");
    }
}
