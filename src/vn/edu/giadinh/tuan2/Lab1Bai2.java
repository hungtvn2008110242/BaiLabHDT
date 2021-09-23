package vn.edu.giadinh.tuan2;

import java.util.Scanner;

public class Lab1Bai2 {

    public static void main(String[] args) throws Exception {
        Float chieudai, chieurong, canhnhonhat, chuvi, dientich;
        System.out.print("Nhap chieu dai va chieu rong cua hinh chu nhat : ");
        Scanner input = new Scanner(System.in);
         chieudai = input.nextFloat();
         chieurong = input.nextFloat();
         dientich = chieudai *chieurong;
         chuvi = (chieudai + chieurong)*2;
         canhnhonhat = Math.min(chieudai, chieurong);
        System.out.println("Dien tich : " + dientich + "\nChu vi : " + chuvi + "\nCanh nho nhat: "+ canhnhonhat);
    }
}
