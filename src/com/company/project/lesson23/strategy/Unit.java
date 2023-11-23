package com.company.project.lesson23.strategy;

import com.company.project.lesson23.strategy.IAction;

public class Unit  {
    IAction moveable;

    public Unit(IAction moveable) {
        if (moveable == null) throw new IllegalArgumentException();
        this.moveable = moveable;
    }
    public  void changeAction(IAction moveable) {
        if (moveable != null) this.moveable=moveable;
    }


    public void move(IAction moveable) {
        moveable.move();
    }
}
