package com.hungtv2008110242.tuan8;

public class Employee extends Person {
    private int Salary;

    @Override
    public String toString() {
        String s;
        ;
        s = name + "," + birthday;
        s += "," + Salary;
        return s;
    }
}
