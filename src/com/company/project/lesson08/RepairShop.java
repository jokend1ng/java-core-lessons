package com.company.project.lesson08;

import java.util.Arrays;

public class RepairShop {
    // в массив можно добавить тип Vehicle и все его подтипы
    private Vehicle[] vehicles = new Vehicle[4]; // null

    // изменить цвет
    // восстановить цвет (установить дефолтный)
    // Машина, Самокат
    // перекрашивать все транспортные средства,
    // у которых есть соответствующий функционал
    public void repairAll(){

        // [car, scooter, train, null]
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
        }
    }
}
