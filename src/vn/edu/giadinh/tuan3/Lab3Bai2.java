package vn.edu.giadinh.tuan3;

public class Lab3Bai2 {
    public static void main(String[] args) {
        for(int i = 1 ; i < 10 ; i++){
            System.out.println();
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("\t%d * %d = %d" , j , i , j*i); 
                System.out.println();
            }
        }
    }
}
