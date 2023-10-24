package com.company.project.lesson08;
// Транспортное средство
public class Vehicle {
    protected String number; // null
    protected int levelOfWare; // 0
    protected int maxSpeed = 120; // 120
    protected String color;

    public String getColor() {
        return color;
    }

    public Vehicle(String number) {
        this.number = number;
    }
    public Vehicle(String number, int maxSpeed){
        this(number);
        this.maxSpeed = maxSpeed;
    }

    public String getNumber(){
        return number;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getLevelOfWare(){
        return levelOfWare;
    }

    public void incLevelOfWare(int value){
        if (value < 0) return;
        levelOfWare += value;
    }
    public void repair(){
        if (levelOfWare > 0) levelOfWare--;
    }
}
