package com.company.project.lesson1516.fruits;

import java.util.Objects;

public class Fruit {
    public Fruit(FruitType type, double price, int count) {
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private final FruitType type;
    private double price;
    private int count;

    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;
    }

    public FruitType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(price, fruit.price) == 0 && type == fruit.type;
    }
}


