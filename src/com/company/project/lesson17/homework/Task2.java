package com.company.project.lesson17.homework;

import com.company.project.lesson08.task.Colorable;
import com.company.project.lesson14.properties.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task2 {
    public Map<String, Vehicle> getCar(Map<String, Vehicle> map, Integer levelOfWare) {
        Map<String, Vehicle> result = new HashMap<>();
        for (String key : map.keySet()) {
            if (map.get(key).getLevelOfWare() > levelOfWare) {
                result.put(key, map.get(key));
            }

        }
        return result;
    }

    public Map<String,List<Colorable>> getColoredCar(List<Colorable> vehicles, Map<String, List<Colorable>> map) {
        for (Colorable vehicle : vehicles) {
            if (map.isEmpty()) {
                map.put(vehicle.getColor(), new ArrayList<>());
                map.get(vehicle.getColor()).add(vehicle);
            } else {
                map.get(vehicle.getColor()).add(vehicle);
            }

        }
        return map;
    }
        public Map<String, Vehicle> getRepaireddCar (List < Vehicle > vehicles) {
            Map<String, Vehicle> result = new HashMap<>();
            for (Vehicle vehicle : vehicles) {
                vehicle.repair();
                result.put(vehicle.getNumber(), vehicle);
            }
            return result;
        }

}

