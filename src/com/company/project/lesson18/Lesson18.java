package com.company.project.lesson18;

import com.company.project.lesson1516.task.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Lesson18 {
    private String string = "String";
    private static String staticString = "Static String";

    public void accessFromLambda(/*final*/ String argString) {
        /*final*/ String localString = "Local String";
        /*final*/ Fruit localFruit = new Fruit(Fruit.FruitType.APRICOT, 300, 4);

        BinaryOperator<?> access = (first, second) -> {
            // в лямбда выражениях есть доступ к свойствам (static и non-static) для чтения и записи
            // в лямбда выражениях есть доступ к локальным переменным метода только для чтения

            System.out.println(string);
            System.out.println(staticString);
            System.out.println(argString);
            System.out.println(localString);
            string = "Новая строка";
            staticString = "Новая строка";
            // argString = "Новая строка";
            // localString = "Новая строка";
            // localFruit = new Fruit(Fruit.FruitType.APPLE, 120, 2);
            localFruit.setCount(localFruit.getCount() + 10);

            // затенение свойств
            // локальные переменные затенить нельзя
            String string = "shadowing";
            System.out.println(string); // "shadowing"
            return 0;
        };
    }

    public static void main(String[] args) {

        /*
         Лямбда синтаксис позволяет
         создать класс, реализующий функциональный интерфейс и
         его экземпляр в несколько строчек кода.
         */

        /*
         Функциональный интерфейс - интерфейс, который содержит один абстрактный и
         любое количество default и static методов.
         Принято добавлять аннотацию @FunctionalInterface.
         @FunctionalInterface - аннотация времени компиляции, компилятор сообщит об ошибке,
         если в интерфейсе будет объявлено больше одного абстрактного метода.
         */

/*
TODO:
        @FunctionalInterface
        public interface InterfaceName<T> {
            T abstractMethod(T firstArg, T secondArg);
        }

         Лямбда синтаксис:
         1. создаёт анонимный класс, имплементирующий InterfaceName
         2. реализация абстрактного метода: (str01, str02) -> (str01 + str02).toUpperCase()
         3. создаёт экземпляр данного класса
TODO:   InterfaceName<String> object = (str01, str02) -> (str01 + " " + str02).toUpperCase();

         Далее можно обратиться к object, как к обычному объекту,
         вызвать доступные методы (всегда определены интерфейсом)
TODO:    String str = object.abstractMethod("lambda", "java 8");

        Можно объявить любое количество реализаций
TODO:   InterfaceName<String> object01 = (str01, str02) -> str01.toUpperCase() + ": " + str02.toLowerCase();
        InterfaceName<Integer> object02 = (int01, int02) -> {
            if (int01 > 0) return int01 + int02;
            return int01 - int02;
        };
        */

        /*
        Лямбда выражение состоит из:
        1. стрелка -> - лямбда
        2. слева от -> - аргументы, которые принимает абстрактный метод интерфейса
        3. справа от -> - тело метода
        */

        /*
        Аргументы:
        1. если метод не принимает на вход аргументы или принимает 2 и более аргументов,
        они ДОЛЖНЫ указываться в () скобках;
        2. если метод принимает на вход 1 аргумент, () скобки МОЖНО опустить;
        3. типы данных аргументов компилятор берет из контекста (абстрактного метода функционального интерфейса)
        */

        /*
        Тело метода и возвращаемое значение:
        1. если тело метода состоит из одной инструкции, его МОЖНО не оборачивать в {} скобки;
        2. если тело метода состоит из нескольких инструкции, оно ДОЛЖНО оборачиваться в {} скобки;
        3. если тело метода не оборачивается в {} скобки, то метод неявно возвращает результат (return не пишем);
        4. если тело метода оборачивается в {} скобки, то для возврата результата необходимо явно указать return
        5. тип возвращаемого значения или void компилятор берет из контекста (абстрактного метода функционального интерфейса)
         */

        /*
        Функциональные интерфейсы, объявленные в java, находятся в пакете java.util.function:
         Predicate<T> + boolean test(T t);
         Function<T, R> + R apply(T t);
         Consumer<T> + void accept(T t);
         и т.д
         */

//        double first = 90.0;
//        double second = 40.0;
//        first + second;

        // Operation: double action(double a, double b);
        Operation plus = (first, second) -> first + second;
        System.out.println(plus.action(45, 90));

        /*
        public class Plus implements Operation {

            @Override
            public double action(double first, double second) {
                return first + second;
            }
        }
        Operation plus = new Plus();
        plus.action(45, 90);
        */

        // Написать реализации для:
        // 1. умножения
        // 2. вычитания
        // 3. деления

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(875, -78, 12, 56, 34, -89, 0, 344));

        ArrayList<String> files = new ArrayList<>(Arrays.asList("01.txt", "02.json", "03.txt", "04.txt", "05.properties"));

        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 5));
        fruits.add(new Fruit(Fruit.FruitType.BANANA, 80, 12));
        fruits.add(new Fruit(Fruit.FruitType.APRICOT, 300, 2));
        fruits.add(new Fruit(Fruit.FruitType.APPLE, 120, 10));
        fruits.add(new Fruit(Fruit.FruitType.PEAR, 180, 2));
        fruits.add(new Fruit(Fruit.FruitType.PEAR, 180, 8));
        fruits.add(new Fruit(Fruit.FruitType.BANANA, 130, 8));

        /*
         удалить из коллекции files строки,
         которые заканчиваются на .json и .properties
        */

        /*
         удалить из коллекции fruits фрукты
         с типом BANANA, которые дешевле 100
        */

        // увеличить стоимость каждого фрукта в 2 раза методом foreach

        /*
         Учитывая, что Comparator - функциональный интерфейс,
         отсортировать список фруктов:
         1. по цене
         2. по цене и количеству
        */

        /*
         Реализовать static метод, который принимает ArrayList fruits
         и Predicate filter, содержащий условие фильтрации.
         Метод возвращает список фруктов, которые прошли проверку переданным filter.
         (метод должен работать с фруктами и их подтипами)
         */

    }
}
