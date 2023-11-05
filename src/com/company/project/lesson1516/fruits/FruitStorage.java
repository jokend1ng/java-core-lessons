package com.company.project.lesson1516.fruits;

import java.util.Comparator;
import java.util.HashSet;

public class FruitStorage {
    private int numberOfSlots;
    private int size =0;
    private HashSet<Fruit> fruitStorage=new HashSet<>();

    public FruitStorage(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }
    public boolean addToStorage(Fruit fruit){
        if (fruit==null){return false;}
        if (size>=numberOfSlots){return false;}
        for (Fruit fruit1 : fruitStorage){
            if (fruit1==fruit){return false;}
            if (fruit.equals(fruit1)){
                int countPrev =fruit1.getCount();
                countPrev +=fruit.getCount();
                fruit1.setCount(countPrev);
                return false;}
            size++;
        }
        size++;
        fruitStorage.add(fruit);
        return true;
    }
}
