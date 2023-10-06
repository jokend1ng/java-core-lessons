package lesson04;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // I. Пользовательский ввод (Scanner)

        // Необходим импорт: import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Введите целое число");
        int intValue = scanner.nextInt(); // 34.6 34htj

        System.out.println("Введите целое число (в диапазоне byte)");
        byte byteValue = scanner.nextByte(); // 345

        System.out.println("Введите число с плавающей точкой");
        double doubleValue = scanner.nextDouble();

        System.out.println("Введите логическое значение");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println(intValue);
        System.out.println(byteValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);*/


        // При вводе неверного типа,
        // программа выбросит исключение java.util.InputMismatchException

        // Можно проверить на тип, чтобы избежать исключения
        System.out.println("Введите целое число");
        if (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            userNumber *= userNumber;
            System.out.println("Ваше число в квадрате: " + userNumber);
        } else {
            System.out.println("Вы ввели не целое число");
            // считываем неверный ввод, чтобы данные не попали в следующее считывание
            scanner.next();
        }

        System.out.println("Введите целое число еще раз");
        int number = scanner.nextInt();
        System.out.println(number);

        System.out.println("Введите любые данные");
        var input = scanner.next(); // строка (тип String)
        System.out.println(input);

    }
}
