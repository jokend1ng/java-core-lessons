package com.company.project.lesson23.strategy;

import com.company.project.lesson23.strategy.IAction;

public class RunFast implements IAction {
    @Override
    public void move() {
        System.out.println("Быстро бежит");
    }
}
