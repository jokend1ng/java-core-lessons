package com.company.project.lesson19;

import com.company.project.lesson14.properties.vehicle.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class lesson19 {
    public static void main(String[] args) {
//        Stream<Integer> values = Stream.of(-560, 312, 12, -55, -100, 45, 0, 0, 23, -20, 221);
//        values.distinct()
//
//                .map(x -> x<0?0:x)
//                .sorted((a, b) ->b-a)
//                .forEach(x -> System.out.println(x));




        String[] colors = {"white", "black", "red", "yellow", "yellowgreen", "green", "dark yellow"};
       long count = Arrays.stream(colors)
                .filter(x -> !x.startsWith("yellow")&&!x.endsWith("yellow"))
                .count();
        System.out.println(count);
        List<Repaintable> repaintables = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new MiniCar(Repaintable.Color.BLACK, "002"),
                new MiniCar(Repaintable.Color.ORANGE, "003"),
                new Car(Repaintable.Color.RED, "004"),
                new MiniCar(Repaintable.Color.BLUE, "005"),
                new Car(Repaintable.Color.BLACK, "006"),
                new Car(Repaintable.Color.ORANGE, "007")
        );
        List<Repaintable.Color> repaintables1 = repaintables.stream()
                .map(x->x.getColor())
                .distinct()
                .toList();


        List<Vehicle> vehicles = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new Train("002", 10, true),
                new MiniCar(Repaintable.Color.ORANGE, "003"),
                new Bus("004"),
                new Train("005", 15, false),
                new Car(Repaintable.Color.BLACK, "006"),
                new MiniCar(Repaintable.Color.ORANGE, "007")
        );
    }
}