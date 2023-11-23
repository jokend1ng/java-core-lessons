package com.company.project.lesson22.task;

public class AppFileWriter implements AppLogger{

    String message;

    public AppFileWriter(String message) {
        this.message = message;
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
