package com.company.project.lesson15;

import com.company.project.lesson1516.customlist.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        MyLinkedList<String> strings = new MyLinkedList<>();
//        LinkedList<String> strings = new LinkedList<>();
        strings.add("Тверь");
        strings.add("Москва");
        strings.add("Спб");
        strings.add("Самара");
        strings.add("dsfa",2);
        strings.reverse();
        System.out.println(strings);
    }
}
