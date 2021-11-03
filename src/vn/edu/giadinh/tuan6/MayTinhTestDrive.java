package vn.edu.giadinh.tuan6;

import com.hungtv2008110242.tuan6.MayTinh;

public class MayTinhTestDrive {
    public static void main(String[] args) {
        MayTinh maytinh = new MayTinh();
        int tong1 = maytinh.tong(7, 9);
        int tong2 = maytinh.tong(2, 3, 5);
        System.out.println("Tổng 1 = " + tong1);
        System.out.println("Tổng 2 = " + tong2);
    }
}
