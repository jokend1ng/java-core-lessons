package com.company.project.lesson08;

public class Bicycle extends Vehicle{
    private int numberOfWheels = 2;
    private String type = "Городской";

    public Bicycle(String number, int maxSpeed, int numberOfWheels) {
        super(number, maxSpeed); // вызов конструктора родителя
        this.numberOfWheels = numberOfWheels;
    }

    public Bicycle(String number, int maxSpeed) {
        super(number, maxSpeed); // вызов конструктора родителя
    }

    public Bicycle(String number, String type) {
        super(number); // вызов конструктора родителя
        this.type = type;
    }

    public Bicycle(int maxSpeed, int numberOfWheels, String type) {
        super("1", maxSpeed);
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getType() {
        return type;
    }
}
