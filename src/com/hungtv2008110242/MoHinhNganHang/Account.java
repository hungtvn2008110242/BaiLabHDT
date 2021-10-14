package com.hungtv2008110242.MoHinhNganHang;

public class Account {
    private int id;
    private String name;
    private int balance = 0;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(int i, int j, int num, int num2) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("That amount exceeds your current balance.");
        }
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public void showdata() {
    }

    public void chuyentien(int i) {
    }

    public void vayno(int i) {
    }

    public void dongtiendien(int i) {
    }
}