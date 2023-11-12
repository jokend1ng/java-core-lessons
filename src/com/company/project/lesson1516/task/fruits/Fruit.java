package com.company.project.lesson1516.task.fruits;
// remove(index)
// add(index, object)
public class Fruit {
    private final FruitType type;
    private double price;
    private int count;

    public Fruit(FruitType type, double price, int count) {
        this.type = type;
        this.price = price;
        this.count = count;
    }
    // конструктор, принимающий значения всех свойств + проверки

    // доступные геттеры и сеттеры


    public FruitType getType() {
        return type;
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

    // equals + hashCode + toString
    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT;
    }
}
