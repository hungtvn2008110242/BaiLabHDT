package vn.edu.giadinh.tuan2;

import java.io.PrintStream;
import java.util.Scanner;

public class CTMinhHoaNhapXuat {

    public static void main(String[] args) {
        
        PrintStream out = System.out;
        out.println("Nguyễn Hưng" + " chào các bạn");
        out.println(3+11);

        float diemKTLapTrinh;

        // biến tham chiếu
        Scanner bienNhapLieu; // Điều khiển từ xa
       
        bienNhapLieu = new Scanner(System.in);

        System.out.print(" Nhập vào điểm môn Kỹ thuật lập trình:");
        diemKTLapTrinh =  bienNhapLieu.nextFloat();
        System.out.println(" Điểm môn kỹ thuật lập trình:" + diemKTLapTrinh);
    }
}