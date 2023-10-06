package lesson04;

import java.util.Scanner;

public class ForAndWhile {
    public static void main(String[] args) {
        // WHILE / DO WHILE / FOR

        // I. Цикл WHILE позволяет выполнять  последовательность действий,
        //  пока проверяемое условие истинно. Условие всегда проверяется до тела цикла.
        //  Чаще используется, когда число итераций (повторений) неизвестно
        /*
        while (логическое выражение / условие) {
            тело цикла - инструкции, которые необходимо выполнять,
            пока 'условие' истинно
        }
        */

        // Пользователь вводит положительные целые числа.
        // Нужно найти их сумму.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите положительные целые числа");
        int userInput;
        int sum = 0;
        while (scanner.hasNextInt() && (userInput = scanner.nextInt()) > 0) {
            sum += userInput;
        }
        scanner.next();
        System.out.println(sum);


        while (true) {
            System.out.println("Введите целое положительное число или " +
                    "0 для выхода из программы");
            userInput = scanner.nextInt();
            if (userInput == 0) { // если пользователь введет 0
                break; // выход из текущего цикла
            }
            if (userInput < 0) { // если пользователь введет отрицательное число
                continue; // переход на следующую итерацию к проверке условия
                // в круглых скобках
            }
            // инструкции будут выполнены,
            // если пользователь введет положительное число
            System.out.println(userInput * userInput);
        }

        // TODO #2
        // Пользователь вводит положительные целые числа,
        // вывести количество чисел, введенное пользователем,
        // среднее арифметическое значение,
        // максимальное значение.

        int task02Sum = 0;
        int task02Count = 0;
        int task02max = 0;

        System.out.println("Вводите положительные целые числа");
        while (scanner.hasNextInt() && (userInput = scanner.nextInt()) > 0) {
            task02Sum += userInput;
            task02Count++; // или ++task02Count;
            if (userInput > task02max) task02max = userInput;
        }
        if (task02Count > 0) System.out.println((double) task02Sum / task02Count);
        System.out.println(task02Count);
        System.out.println(task02max);

        // целочисленное деление на 0 - исключение
        // деление на 0 числа с плавающей точкой - Infinity / -Infinity


        // Пользователь должен вводить числа до тех пор,
        // пока число не будет находиться в диапазоне [9; 90)
        // от 9 (включая 9) до 90 (исключая 90)
        int min = 9, max = 90;
        int answer = 0;
        do {
            System.out.println("Введите число");
            if (scanner.hasNextInt()) answer = scanner.nextInt();
            else scanner.next();
        /*} while (!(answer >= min && answer < max));*/
        } while (answer < min || answer >= max);

        System.out.println("Ваше число принято");


        // I. FOR
        //for (; ;) {} // синтаксически правильный бесконечный цикл for
        //for (инициализация; условие; обновление) {
        //    тело цикла
        // }
        // инициализация - выполняется один раз при входе в цикл
        // условие - проверяется каждый раз перед выполнением тела цикла
        // обновление - выполняется после завершения тела цикла, перед проверкой условия
        // тело цикла выполняется, если условие истинно

        // Известна цена за 1кг. яблок.
        // Нужно вывести цену за 1кг, 2кг, 3кг, 4кг, 5кг.
        double price = 200; // за 1 кг.
        for (int quantity = 1; quantity <= 5; quantity++) {
            double currentPrice = quantity * price;
            System.out.println(quantity + "кг. " + " стоят " + currentPrice);
        }

        // TODO #3
        // Найти сумму чисел от 20 до 143 включительно, исключая 37, 45 и 101
        int task03Sum = 0;
        for (int i = 20; i <= 143; i++) {
            if (i == 37 || i == 45 || i == 101) continue;
            task03Sum += i;
            // или
            // if (i != 37 && i != 45 && i != 101) sum += i;
        }
        System.out.println(task03Sum);


        // TODO #4
        System.out.print("без переноса строки");
        System.out.println("с переносом строки");
        // Написать программу, которая распечатает лесенку
        /*
        1
        12
        123
        1234
        12345
        123456
        */
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
