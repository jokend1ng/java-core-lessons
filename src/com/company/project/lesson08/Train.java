package com.company.project.lesson08;

public class Train extends Vehicle{
    private int carCount;
    private boolean isClimateControl;

    public Train(String number, int maxSpeed,
                 int carCount, boolean isClimateControl) {
        super(number, maxSpeed);
        this.carCount = carCount;
        this.isClimateControl = isClimateControl;
    }

    public void changeClimateControl(){
        isClimateControl = !isClimateControl;
    }

    public int getCarCount() {
        return carCount;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }

    // переопределение метода родителя
    // можно изменить только модификатор доступа на расширение
    @Override // аннотация времени компиляции сообщит об ошибке переопределения
    public void repair(){
        if (carCount < 7 && carCount > 0) {
            if (levelOfWare >= 2) levelOfWare -= 2;
        } else {
            // вызов метода родителя
            super.repair();
            //if (levelOfWare > 0) levelOfWare--;
        }
    }

    @Override
    public void breakDown() {
        this.incLevelOfWare(2);
        if (carCount > 0) carCount -= 1;
    }
}
