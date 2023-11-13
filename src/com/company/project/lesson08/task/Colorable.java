package com.company.project.lesson08.task;

import com.company.project.lesson14.properties.vehicle.Vehicle;

public interface Colorable {
    public void setColor(String color);
    public void setDefaultColor();
    public String getColor();
    default void color(){};


}
