package com.company.project.lesson08;
// Транспортное средство
// нельзя создать экземпляр абстрактного класса (вызвать конструктор)
// можно использовать в качестве общего типа при объявлении переменных
// могут содержать абстрактные методы (без реализации)
// абстрактные методы должны быть реализованы в неабстрактных наследниках
public abstract class Vehicle {
    protected String number; // null
    protected int levelOfWare; // 0
    protected int maxSpeed = 120; // 120

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

    // абстрактные методы - методы без реализации
    public abstract void breakDown();
}
