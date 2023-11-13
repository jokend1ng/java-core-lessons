package com.company.project.lesson08;

import com.company.project.lesson08.task.Colorable;

public class Scooter extends Bicycle implements Colorable {
    protected boolean isElectric;
    private String color;

    public Scooter(int maxSpeed, boolean isElectric) {
        super("2", maxSpeed);
        this.isElectric = isElectric;
    }


    @Override
    public void repair() {
        if (isElectric){
            if(levelOfWare>1){
            levelOfWare-=2;
            }else if(levelOfWare>0){levelOfWare--;
            }

        }else{
            if (levelOfWare>2){
                levelOfWare-=3;
            }else{
                levelOfWare=0;
            }

        }
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setDefaultColor() {
        this.color=super.getColor();
    }

    @Override
    public String getColor() {
        return color;
    }
}
