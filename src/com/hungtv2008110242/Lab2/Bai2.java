package com.hungtv2008110242.Lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("nhap he so a,b,c");
        Float a,b,c;
        Scanner heso = new Scanner (System.in);
         a = heso.nextFloat();
         b = heso.nextFloat();
         c = heso.nextFloat();
        if(a==0){
            if(b==0 && c==0){
             System.out.println("Phương trình vô số nghiệm !!!");
          }
        else if( b!=0 ){
            System.out.println("Phương trình có nghiệm x =" + -c/b);
        }
    }
    else {
        Float delta = b*b - 4*a*c;
        if(delta > 0){
            System.out.println("Phương trình có 2 nghiệm \nx1 = " + (-Math.sqrt(delta)+b)/2*a + "\n"+"x2 = " + (-Math.sqrt(delta)-b)/2*a);
        }
        else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép x = " + -b/2*a);
        }
      }
    }
}