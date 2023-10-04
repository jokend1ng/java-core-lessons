package lesson03;

public class ControlFlowStatements {
    public static void main(String[] args) {
        // I. блоки кода
        var one = 1; // объявили переменную через var, тип данных переменной - int,
        // тк int используется по умолчанию для целых чисел
        // переменная one видна в текущем и, соответственно, во всех вложенных блоках
        { // начало блока 1
            var two = 2; // переменная two видна в текущем и, соответственно, во всех вложенных блоках
            System.out.println(one);
            System.out.println(two);
            { // начало блока 2
                var three = 3; // переменная three видна в текущем блоке
                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
            } // конец блока 2
            // System.out.println(three); // переменная three не видна, тк объявлена и существует во вложенном блоке №2
        } // конец блока 1
        System.out.println(one);
        // System.out.println(two); // переменная two не видна, тк объявлена и существует во вложенном блоке №1
        // System.out.println(three); // переменная three не видна, тк объявлена и существует во вложенном блоке №2

        // I. IF ... ELSE
        double maxTemperatureValue = 1000;
        double currentTemperatureValue = 200.5;
        if (currentTemperatureValue > maxTemperatureValue) { // false
            System.out.println("Предупреждение: Превышено максимальное значение"); // игнорируется
        }

        int maxScoreValue = 100;
        int currentScoreValue = 20;
        if (currentScoreValue == maxScoreValue) { // false
            System.out.println("Вы набрали достаточное количество очков"); // игнорируется
        } else {
            System.out.println("Вы не успели набрать достаточное количество очков. Попробуйте еще раз"); // выполняется
        }

        char currentChar = 'a';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь"); // выполняется
        } else if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор"); // игнорируется
        } else {
            System.out.println("Вам еще не выдана роль"); // игнорируется
        }

        // фигурные скобки можно опустить, если if соответствует одна инструкция
        boolean requestResult = false;
        if (requestResult) System.out.println("Запрос успешно обработан");
        else System.out.println("Обработка запроса завершилась неудачей");

        // В чём разница?
        currentChar = 'с';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        } else if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор");
        }

        currentChar = 'с';
        if (currentChar == 'a' || currentChar == 'z') {
            System.out.println("Ваша роль - пользователь");
        }
        if (currentChar == 'x') {
            System.out.println("Ваша роль - администратор");
        }

        // TODO #3
        // TODO #4

        // I. SWITCH CASE
        // работает только с int (Integer), byte (Byte), short (Short), char (Character), enum, String
        // выполняется от первого совпадения до первого break
        int monthNumber = 4;
        switch (monthNumber) {
            case 12: // 12 не равен monthNumber
            case 1:  // 1 не равен monthNumber
            case 2:  // 2 не равен monthNumber
                System.out.println("Зима"); // ignore
                break;
            case 3: // 3 не равен monthNumber
            case 4: // 4 равно monthNumber
            case 5:
                System.out.println("Весна"); // execute
                break; // switch завершает работу
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка номера месяца");
        }

        // начиная с java 14 можно использовать новый синтаксис switch
        // в стиле лямбда выражений (lambda style)
        monthNumber = 6;
        switch(monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима"); // monthNumber не равен 12, не равен 1, не равен 2
            case 3, 4, 5 -> System.out.println("Весна"); // monthNumber не равен 3, не равен 4, не равен 5
            case 6, 7, 8 -> System.out.println("Лето"); // инструкции выполнятся, monthNumber равен 6, switch завершит работу
            case 9, 10, 11 -> System.out.println("Осень");
            // default -> System.out.println("неверный ввод"); - необязательный блок
        }

        char seasonLetter = switch(monthNumber) {
            case 12, 1, 2 -> 'з'; // monthNumber не равен 12, не равен 1, не равен 2
            case 3, 4, 5 -> 'в'; // monthNumber не равен 3, не равен 4, не равен 5
            case 6, 7, 8 -> 'л'; // инструкции выполнятся, monthNumber равен 6, switch вернёт 'л' и завершит работу
            case 9, 10, 11 -> 'о';
            default -> 'e'; // обязательный блок
        };
        System.out.println(seasonLetter);

        seasonLetter = switch(monthNumber) {
            case 12, 1, 2 -> {
                System.out.println("Зима");
                yield  'з';
            }
            case 3, 4, 5 -> {
                System.out.println("Весна");
                yield 'в';
            }
            case 6, 7, 8 -> {
                System.out.println("Лето");
                yield 'л';
            }
            case 9, 10, 11 -> {
                System.out.println("Осень");
                yield 'о';
            }
            default -> { // обязательный блок
                System.out.println("неверный ввод");
                yield  'e';
            }
        };
        System.out.println(seasonLetter);

        // TODO #5
        // TODO #6

    }
}
