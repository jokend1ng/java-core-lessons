package com.company.project.lesson9;

//
// класс Point имплементирует (реализует) интерфейс Drawable и Runnable
// класс не является абстрактным и обязан реализовать все абстрактные методы интерфейсов
public class Point implements Drawable, Runnable{
    // final свойства нельзя изменить (значение для примитива, ссылку для объекта)
    // должны быть инициализированы при объявлении или в конструкторе
    private final int x /* = 0 */;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override // final методы нельзя переопределять
    public final void draw() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    @Override
    public void clear() {

    }

    @Override
    public void run() {
        System.out.println("point is running...");
    }
}
