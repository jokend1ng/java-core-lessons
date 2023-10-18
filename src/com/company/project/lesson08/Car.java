package com.company.project.lesson08;
public class Car extends Vehicle {
    protected String color ="White";
    

    public Car(String number) {
        super("1");
        this.maxSpeed=240;
    }


    public void setColor(String color) {
        this.color = color;

    }

}
