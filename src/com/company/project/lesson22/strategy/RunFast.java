package com.company.project.lesson22.strategy;

import com.company.project.lesson22.chain.Action;

public class RunFast extends Action implements IAction<Unit>{
    @Override
    public void execute(Unit unit) {
        System.out.println("unit RunFast");
    }

    @Override
    public void execute() {

    }
}
