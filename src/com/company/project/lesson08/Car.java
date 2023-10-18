package com.company.project.lesson08;
public class Car extends Vehicle {
    protected String color ="White";
    protected String number="1";

    public Car(String number) {
        super(number);
        this.maxSpeed=240;
    }


    public void setColor(String color) {
        this.color = color;

    }

}
