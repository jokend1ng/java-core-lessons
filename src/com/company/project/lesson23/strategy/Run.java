package com.company.project.lesson23.strategy;

import com.company.project.lesson23.strategy.IAction;

public class Run <T> implements IAction {

    @Override
    public void move() {
        System.out.println("бежит");
    }
}
