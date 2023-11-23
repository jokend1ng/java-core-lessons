package com.company.project.lesson22.task;

public class ConsoleWriter extends Event implements AppLogger{
    public ConsoleWriter(AppLogger appLogger) {
        super(appLogger);
    }

    public ConsoleWriter() {
    }

    @Override
    public void log(String message) {
        System.out.println(message);

    }
}
