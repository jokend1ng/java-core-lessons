package com.company.project.multithreading.lesson27.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task2 extends Thread {
    List<Item> items = new ArrayList<>();
    File file;

    public Task2(String path) {
        this.file = new File(path);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String [] array = line.split("::");
                Item item = new Item(Integer.parseInt(array[0]),array[1],Double.parseDouble(array[2])
                        ,Integer.parseInt(array[3]));
                items.add(item);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Thread thread =new Thread(()-> {
            Task2 t1 = new Task2("test");
            Task2 t2 = new Task2("test");
            Task2 t3 = new Task2("test");
            Task2 t4 = new Task2("test");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            List<Item>arrayList = new ArrayList<Item>();
            arrayList.addAll(t1.getItems());
            arrayList.addAll(t2.getItems());
            arrayList.addAll(t3.getItems());
            arrayList.addAll(t4.getItems());

            Map<String,List<Item>> items = arrayList.stream()
                  .collect(Collectors.groupingBy(Item::getName,Collectors.mapping(Item::getSort,Collectors.toList())));// нашел такое но не понимаю как оно работает
        });


    }




}