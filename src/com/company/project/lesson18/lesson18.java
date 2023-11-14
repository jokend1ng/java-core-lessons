package com.company.project.lesson18;

import com.company.project.lesson1516.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class lesson18 {
    public static void main(String[] args) {
        ArrayList<String> files = new ArrayList<>(Arrays.asList("01.txt", "02.json", "03.txt", "04.txt", "05.properties"));
        System.out.println(files.removeIf(x -> !(x.endsWith("json") || x.endsWith("properties"))));
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 5));
        fruits.add(new Fruit(Fruit.FruitType.BANANA, 80, 12));
        fruits.add(new Fruit(Fruit.FruitType.APRICOT, 300, 2));
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 10));
        fruits.add(new Fruit(Fruit.FruitType.PEAR, 180, 2));
        fruits.add(new Fruit(Fruit.FruitType.PEAR, 180, 8));
        fruits.add(new Fruit(Fruit.FruitType.BANANA, 130, 8));
        fruits.forEach(x -> x.setCount(x.getCount() * 2));
        Comparator<Fruit> price = (a, b) -> (int) (a.getPrice() - b.getPrice());
        Comparator<Fruit> count = (a, b) -> a.getCount() - b.getCount();
        fruits.sort(price);
        fruits.sort(price.thenComparing(count));
        Comparator <Fruit> comparingByPrice = new Comparator<Fruit>(){
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return (int) (o1.getPrice()-o2.getPrice());
            }
        };
        Comparator <Fruit>comparingByCount = new Comparator<Fruit>(){
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return  (o1.getCount()-o2.getCount());
            }
        };
    }
//    public static ArrayList getFruit(ArrayList<Fruit> list, Predicate<Fruit> filter){
//        ArrayList<Fruit> fruits = new ArrayList<>();
//        return list.

    //    }


}