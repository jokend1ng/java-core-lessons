package com.company.project.lesson08;

import com.company.project.lesson08.task.Colorable;

public class Car extends Vehicle implements Colorable {


    @Override
    public String getColor() {
        return super.getColor();
    }

    public Car(String number) {
        super("1");
        this.maxSpeed=240;
    }


    @Override
    public void setColor(String color) {
        this.color = color;

    }

    @Override
    public void setDefaultColor() {
        this.color =super.getColor();

    }

}
