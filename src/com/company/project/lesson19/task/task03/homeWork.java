package com.company.project.lesson19.task.task03;

import com.company.project.lesson14.properties.vehicle.Car;
import com.company.project.lesson14.properties.vehicle.MiniCar;
import com.company.project.lesson14.properties.vehicle.Repaintable;
import com.company.project.lesson14.properties.vehicle.Vehicle;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class homeWork {
    public static void main(String[] args) {
        List<Car> vehicles = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new MiniCar(Repaintable.Color.ORANGE, "002"),
                new MiniCar(Repaintable.Color.BLACK, "003"),
                new Car(Repaintable.Color.RED, "004"),
                new Car(Repaintable.Color.BLACK, "005"),
                new MiniCar(Repaintable.Color.ORANGE, "006")
        );

        List<String> sortedCarList = vehicles.stream()
                .sorted((o1, o2) -> o2.getLevelOfWare() - o1.getLevelOfWare())
                .map(Car::getNumber)
                .toList();

        int summoWareLevel = vehicles.stream()
                .mapToInt(x -> x.getLevelOfWare())
                .sum();

        vehicles.stream()
                .peek(x -> x.changeColor(Repaintable.Color.GOLD))
                .forEach(System.out::println);

    }

}