package vn.edu.giadinh.tuan7;

import vn.edu.giadinh.tuan6.Circle;
import vn.edu.giadinh.tuan6.Square;

public class ShapeTestDrive {
    public static void main(String[] args) {

        Square square = new Square("hinhVuong.aif");

        Circle circle = new Circle("hinhTron.aif");

        circle.rotate();
        circle.playSound();

        Amoeba amoeba = new Amoeba("amoeba.hif", 5, 10);
        amoeba.rotate();
        amoeba.playSound();

    }
}
