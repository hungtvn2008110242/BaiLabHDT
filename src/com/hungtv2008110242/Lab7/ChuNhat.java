package com.hungtv2008110242.Lab7;

public class ChuNhat {
    private double rong;
    private double dai;

    protected void setDai(double dai) {
        this.dai = dai;
    }

    public double getDai() {
        return dai;
    }

    protected void setRong(double rong) {
        this.rong = rong;
    }

    public double getRong() {
        return rong;
    }

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    protected double getChuVi() {
        return (dai + rong) * 2;
    }

    protected double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Chu vi hcn = " + getChuVi());
        System.out.println("Dien tich hcn = " + getDienTich());
    }
}
