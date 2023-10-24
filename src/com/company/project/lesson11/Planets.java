package com.company.project.lesson11;

public enum Planets {
    MERCURY("Меркурий", 2400, 0.33 * Math.pow(10, 24)),
    VENERA("Венера", 6100, 4.9 * Math.pow(10, 24)),
    EATH("Земля", 6400, 4.9 * Math.pow(10, 24)),
    MARS("Марс", 3400, 0.6 * Math.pow(10, 24)),
    JUPITER("Юпитер", 72000, 1900 * Math.pow(10, 24)),
    SATURN("Сатурн", 60000, 570 * Math.pow(10, 24)),
    URAN("Уран", 26000, 87 * Math.pow(10, 24)),
    NEPTUNE("Нептун", 25000, 103 * Math.pow(10, 24)),
    PLUTONE("Плутон", 1100, 0.015* Math.pow(10, 24));
    private String name;
    private int radius;
    private double weight;

    Planets(String name, int radius, double weight) {
        this.name = name;
        this.radius = radius;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }
}
