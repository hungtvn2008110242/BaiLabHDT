package com.hungtv2008110242.tuan7;

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
