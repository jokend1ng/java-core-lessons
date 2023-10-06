package lesson04;

import java.util.Scanner;

public class ForAndWhile {
    public static void main(String[] args) {

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
        while (scanner.hasNextInt() && ((userInput = scanner.nextInt()) > 0)) {
            sum += userInput;
        }
        scanner.next();
        System.out.println(sum);

        while (true) {
            System.out.println("Введите целое положительное число или 0 для выхода из программы");
            userInput = scanner.nextInt();
            if (userInput == 0) { // если пользователь введет 0
                break; // выход из текущего цикла
            }
            if (userInput < 0) { // если пользователь введет отрицательное число
                continue; // переход на следующую итерацию к проверке условия в круглых скобках
            }
            // инструкции будут выполнены, если пользователь введет положительное число
            System.out.println(userInput * userInput);
        }

        // TODO #2


        // I. FOR
        // Известна цена за 1кг. яблок.
        // Нужно вывести цену за 1кг, 2кг, 3кг, 4кг, 5кг.
        double price = 200; // за 1 кг.
        for (int quantity = 1; quantity <= 5; quantity++) {
            double currentPrice = quantity * price;
            System.out.println(quantity + "кг. " + " стоят " + currentPrice);
        }
        // .1, .2, .3 и т.д

        // TODO #3
        // TODO #4

        // Пользователь должен вводить числа до тех пор,
        // пока число не будет находиться в диапазоне [9; 90)
        int min = 9, max = 90;
        int answer = 0;
        do {
            System.out.println("Введите число");
            if (scanner.hasNextInt()) answer = scanner.nextInt();
            else scanner.next();
        } while (answer < min || answer >= max);

        System.out.println("Ваше число принято");
    }
}
