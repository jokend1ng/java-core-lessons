package com.company.project.lesson27;

import java.util.ArrayList;
import java.util.List;

public class ThreadTask extends Thread {
    private List<String> stringList;

    public ThreadTask(List<String> stringList) {
        this.stringList = stringList;
    }

    public void printList() {
        stringList.forEach(System.out::println);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        printList();
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        ThreadTask t = new ThreadTask(stringList);
        t.setName("Tread01");
        ThreadTask t2 = new ThreadTask(stringList);
        t2.setName("Tread02");
        t.printList();
        t.start();
        t2.start();
        Thread threadWithlambda=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        System.out.println("main");
        RunableTask r =new RunableTask("task");
        Thread treadWithRunnableTask = new Thread(r);
        System.out.println(treadWithRunnableTask.getState());
        treadWithRunnableTask.start();
        threadWithlambda.start();

    }
}
