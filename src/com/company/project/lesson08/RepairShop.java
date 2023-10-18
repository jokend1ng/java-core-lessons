package com.company.project.lesson08;

import java.util.Random;

public class RepairShop {
    // в массив можно добавить тип Vehicle и все его подтипы
    private Vehicle[] vehicles;
    private int count;
    private String[] colors = {"красный", "жёлтый", "оранжевый", "чёрный"};
    public void addToVehicles(Vehicle vehicle){
        vehicles[count]=vehicle;
        count++;
    }

    public void repairAll(){
        for (Vehicle vehicle : vehicles) {
            // для вызова доступны только методы супертипа, т.е. Vehicle
            // но будет использована реализация конкретного подтипа
            vehicle.repair();
            // оператор instanceof вернет true,
            // если экземпляр (слева) принадлежит указанному справа типу
            /*if (vehicle instanceof Train) {
                Train t = (Train) vehicle;
                t.changeClimateControl();
            }*/
            // проверка на принадлежность типу + приведение
            // аналогично предыдущей записи
            if (vehicle instanceof Train train) {
                train.changeClimateControl();
            }
            Random random =new Random();
            if (vehicle instanceof Car car){
                car.setColor(colors[random.nextInt(colors.length)]);
                for(int i=0;i<vehicles.length;i++) {
                    if(vehicles[i] == car) {
                        vehicles[i]=null;
                    }
                }
            }
        }
    }
}

