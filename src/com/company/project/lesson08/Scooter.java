package com.company.project.lesson08;

public class Scooter extends Bicycle{
    protected boolean isElectric;

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
}
