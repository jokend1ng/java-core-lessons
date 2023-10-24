package com.company.project.lesson08.task;

public interface Colorable {
    public void setColor(String color);
    public void setDefaultColor();
    default void color(){};
}
