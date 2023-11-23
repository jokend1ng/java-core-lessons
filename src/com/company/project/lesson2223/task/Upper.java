package com.company.project.lesson22.task;

public class Upper extends Event implements  AppLogger {
    public Upper(AppLogger appLogger) {
        super(appLogger);
    }

    public Upper() {
    }

    @Override
    public void log(String message) {
        System.out.println(message);

    }
}
