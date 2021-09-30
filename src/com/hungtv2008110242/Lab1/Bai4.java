package com.hungtv2008110242.Lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhap he so a b c :");
        Float a,b,c,delta,cdelta;
        Scanner input = new Scanner(System.in);
         a = input.nextFloat();
         b = input.nextFloat();
         c = input.nextFloat();
         delta = b*b - 4*a*c;
         cdelta = (float) Math.sqrt(delta);
        System.out.println("Delta cua ptbac2 la : " + delta + "\nCan delta cua pt la : " + cdelta);
    }
    
}
