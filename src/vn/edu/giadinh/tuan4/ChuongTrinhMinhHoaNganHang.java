package vn.edu.giadinh.tuan4;

public class ChuongTrinhMinhHoaNganHang {
    public static void show(String string, int balance) {
        System.out.println("Account Number = " + string);
        System.out.println("Account Balance = " + balance);
    }
        public static void main(String[] args) {
            int account_balance = 100;
            int account_number = 20;
            account_balance = account_balance + 100;
            show("Account_number = %d ",account_number);
            show("Account_Balance = %d ", account_balance);

            account_balance = account_balance - 50;
            show("Account_number = %d ",account_number);
            show("Account_Balance = %d ", account_balance);

            account_balance = account_balance - 10;
            show("Account_number = %d ",account_number);
            show("Account_Balance = %d ", account_balance);

        }
    }

