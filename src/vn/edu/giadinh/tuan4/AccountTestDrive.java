package vn.edu.giadinh.tuan4;

public class AccountTestDrive {
    private static final String Void = null;

    public static void main(String[] args) {
        Account account;
        account = new Account(123, 500);
        account.showData();
        account.deposit(500);
        account.showData();
        account.withdraw(0);
        int account_number;
        int account_balance;
    }

    void showData() {
        String account_number;
        System.out.println("Account number: ");
        String account_balance;
        System.out.println("Account balance: ");
    }
}
