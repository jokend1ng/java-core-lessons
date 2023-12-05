package com.company.project.lesson27;

public class RunableTask implements Runnable{
    String print;

    public RunableTask(String print) {
        this.print = print;
    }
    public void print(){
        System.out.println(print.toLowerCase());
    }

    @Override
    public void run() {
        print();
    }
}
