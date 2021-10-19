package com.hungtv2008110242.tuan5;

public class account {
    int account_number;
    int account_balance;

    void Account(int a, int b) {
        account_number = a;
        account_balance = b;
    }

    void show() {
        System.out.println("Account Number = " + account_number);
        System.out.println("Account Balance = " + account_balance);
    }

    void deposit() {
        account_balance += 100;
        System.out.println("Account Balance = " + account_balance);
    }

    void withdraw() {
        account_balance -= 50;
        System.out.println("Account Balance = " + account_balance);
    }

    public void deposite(int i) {
    }

    public void Withdraw(int i) {
    }

    public void Show_Balance() {
    }
}
