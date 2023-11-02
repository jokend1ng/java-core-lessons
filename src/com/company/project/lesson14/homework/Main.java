//package com.company.project.lesson14.homework;
//
//import com.company.project.lesson14.properties.service.User;
//
//import java.io.Serializable;
//
//public class Main {
//    public void main(String[] args) {
//        PairContainer<Number, String> firstContainer = new PairContainer<>(1, "number1");
//        PairContainer<String, User<Number>> secondContainer = new PairContainer<>("number2", new User<>("number2", 1));
//        PairContainer<String, PairContainer<Number, User<String>>> thirdContainer = new PairContainer<>("number3",
//                new PairContainer<>(4, new User<>("number5", "number")));
//
//        Cat cat = new Cat();
//        Kitten kitten = new Kitten();
//        Dog dog = new Dog();
//        Animal animal = new Animal();
//
//        Task.<Cat>void01(cat);
//        Task.<Kitten>void01(kitten);
//
//        Task.<Cat>void02(cat);
//        Task.<Kitten>void02(kitten);
//        Task.<Dog>void02(dog);
//
//
//        Task.<Dog>void03(dog);
//
//
//    }
//
//
//}
//interface Eatable extends Serializable {
//}
//
//interface Runnable {
//}
//
//class Animal implements Runnable {
//}
//
//class Cat extends Animal implements Eatable {
//}
//
//class Kitten extends Cat {
//}
//
//class Dog extends Animal implements Serializable {
//}
//
//
//class Task {
//    public static <T extends Cat & Eatable> void void01(T object) {
//        // ВОПРОС: методы каких типов можно вызвать у object ???
//        //Cat
//    }
//
//    public static <T extends Animal & Serializable> void void02(T object) {
//        // ВОПРОС: методы каких типов можно вызвать у object ???
//        //Animal
//    }
//
//    public static <T extends Serializable & Runnable> void void03(T object) {
//        // ВОПРОС: методы каких типов можно вызвать у object ???
//        //Dog
//    }
//
//
//}