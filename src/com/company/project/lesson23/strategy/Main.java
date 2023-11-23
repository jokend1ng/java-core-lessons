package com.company.project.lesson23.strategy;

public class Main {
    public static void main(String[] args) {
        IAction<Unit> run =new Run();
        IAction <Unit>  runFast =new RunFast();
        IAction <Unit>  walk =new Walk();

        Unit tiger =new Unit(run);
        tiger.move(runFast);
        tiger.move(run);
        tiger.move(walk);
    }




}
