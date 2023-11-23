package com.company.project.lesson22.task;

import com.company.project.lesson22.task.AppLogger;

public class Delimiter extends Event implements AppLogger {
    public Delimiter(AppLogger appLogger) {
        super(appLogger);
    }

    public Delimiter() {
    }

    @Override
    public void log(String message) {

            System.out.println(message);

    }
}
