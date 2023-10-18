package com.company.project.lesson9;

// класс Figure имплементирует (реализует) интерфейс Drawable
// класс не является абстрактным и обязан реализовать все абстрактные методы интерфейса
public class Figure implements Drawable{
    private Point[] points;

    public Figure(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }

    @Override
    public void draw() {
        for (Point point : points) {
            System.out.println("new point");
            point.draw();
        }
    }

    @Override
    public void clear() {
        for (Point point : points) {
            point.clear();
        }
    }
}
