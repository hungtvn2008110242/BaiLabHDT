package vn.edu.giadinh.tuan8;

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

    public void setName(String string) {
    }

    public void setBirthday(String string) {
    }
}
