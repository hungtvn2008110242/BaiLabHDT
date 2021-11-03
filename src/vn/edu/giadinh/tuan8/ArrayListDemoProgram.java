package vn.edu.giadinh.tuan8;

import java.util.ArrayList;
import java.util.List;

import vn.edu.giadinh.tuan6.Square;
import vn.edu.giadinh.tuan7.inheritance.Animal;
import vn.edu.giadinh.tuan7.inheritance.Circle;
import vn.edu.giadinh.tuan7.inheritance.Dog;
import vn.edu.giadinh.tuan7.inheritance.Shape;

public class ArrayListDemoProgram {
    private static Shape Circle;
    private static Shape Square;

    public static void main(String[] args) {
        List<String> list;

        list = new ArrayList<>();

        list.add("Tý");
        list.add("tủn");
        list.add("Tứn");

        System.out.println(list);

        ArrayList<String> list5;

        list.add("Mai");
        list.add("hà");

        System.out.println("số phần tử của list 5: " + list.size());
        System.out.println(list);

        List<Shape> list2 = new ArrayList<>() {
            Circle circle = new Circle();
            Square square = new Square();
            Amoeba amoeba = new Amoeba();
        };

        list2.add(Circle);
        list2.add(Square);
        list2.add(Circle);

        for (Shape shape : list2) {
            shape.playSound();
            shape.rotate();
        }

        for (int i = 0; i < list2.size(); i++) {
            Shape shape = list2.get(i);
            shape.playSound();
            shape.rotate();
        }

        List<Animal> list3;

        List<Dog> list4;
    }

}
