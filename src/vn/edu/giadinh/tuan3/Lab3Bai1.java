package vn.edu.giadinh.tuan3;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
            System.out.print("Nhập số cần kiểm tra : ");
            Scanner SoCanKiemTra = new Scanner(System.in);
            int KiemTraSo = SoCanKiemTra.nextInt();
            KiemTraSoNguyenTo(KiemTraSo);
            
        }
        public static void KiemTraSoNguyenTo(int n){
            boolean ok = true;
            for(int i = 2 ; i < n - 1 ; i++){
                if(n % i == 0){
                    ok = false;
                    break;
                }
            }
            if(ok == true){
                System.out.print("Đây là số nguyên tố !!!");
            }
            else{
                System.out.print("Đây không là số nguyên tố !!!");
        }
    }
}