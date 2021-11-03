package vn.edu.giadinh.tuan7;

public class intSquare {
    private int intValue;

    public intSquare() {
    }

    public intSquare(int i) {
        intValue = i;
    }

    private int calculateSquare() {
        return intValue * intValue;
    }

    public int getSquare() {
        return calculateSquare();
    }
}
