package com.company.project.multithreading.lesson27.homework;

public class Item {
    private int id;
    private String name;
    private double price;
    private int howmany;

    public Item(int id, String name, double price, int howmany) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.howmany = howmany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHowmany() {
        return howmany;
    }

    public void setHowmany(int howmany) {
        this.howmany = howmany;
    }
    public double getSort(Item other){
        return this.getHowmany()*this.getPrice()- other.getHowmany()* other.getPrice();
    }
}
