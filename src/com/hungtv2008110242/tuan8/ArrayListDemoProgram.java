package com.hungtv2008110242.tuan8;

import java.util.ArrayList;
import java.util.List;

import com.hungtv2008110242.tuan6.Circle;
import com.hungtv2008110242.tuan6.Square;
import com.hungtv2008110242.tuan7.Amoeba;
import com.hungtv2008110242.tuan7.inheritance.Shape;

public class ArrayListDemoProgram {
    public static void main(String[] args) {
        List<String> list;

        list = new ArrayList<>();

        list.add("Tý");
        list.add("tủn");
        list.add("Tứn");

        System.out.println(list);

        ArrayList<String> list5;

        list5.add("Mai");
        list5.add("hà");

        System.out.println("số phần tử của list 5: " + list5.size());
        System.out.println(list5);

        List<Shape> list2 = new ArrayList<>(){
        Circle circle = new Circle();
        Square square = new Square();
        Amoeba amoeba = new Amoeba();
    
        list2.add(circle);
        list2.add(square);
        list2.add(amoeba);


        for( Shape shape : list2){
            shape.playSound();
            shape.rotate();
        }

        for (int i = a; i < list2.size(); i++){
            Shape shape = list2.get(i);
            shape.playSound();
            shape.rotate();
        }

        List<Animal> list3;

        List<Dog> list4;
        }
    }
}