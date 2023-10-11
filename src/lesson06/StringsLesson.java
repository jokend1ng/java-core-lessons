package lesson06;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class StringsLesson {
    public static void main(String[] args) {
        // char (примитивный тип данных) 16 бит - символ Unicode
        char char01 = 'J'; // сам символ в одинарных кавычках
        // но "J" - строка, ссылочный тип String
        char char02 = 74; // номер символа в таблице Unicode в диапазоне от 0 до 65535
        char char03 = '\u0044'; // 16ричное представление в escape последовательности

        System.out.print(char01);
        System.out.print(char02);
        System.out.print(char03);

        System.out.println('\uD83D');
        System.out.println('\uDC3E');

        System.out.println("\uD83D\uDC3E"); // суррогатна€ пара ?

        // каждый символ юникода может быть представлен одним char или парой (суррогатна€ пара) char

        String string01 = "Cat";
        String string02 = "Cat";
        String string03 = new String("Cat");

        // —равнение ссылок
        System.out.println(string01 == string02); // true
        System.out.println(string01 == string03); // false

        // сравнение строк
        string01 = "—трока";
        string02 = "строка";
        if (string01.equals(string02)) System.out.println("—троки равны");
        if (string01.equalsIgnoreCase(string02)) System.out.println("—троки равны без учета регистра");

        if (string01.compareTo(string02) < 0) { // или compareToIgnoreCase - без учета регистра
            System.out.println(string01 + " меньше " + string02);
        } else if (string01.compareTo(string02) > 0) { // или compareToIgnoreCase - без учета регистра"
            System.out.println(string01 + " больше " + string02);
        } else {
            System.out.println("—троки равны");
        }

        // верхний и нижний регистр
        string01 = " JaVa ";
        string02 = " deVEloPEr ";
        String upperString = string01.toUpperCase();
        String lowerString = string02.toLowerCase();
        System.out.println(upperString);
        System.out.println(lowerString);


        // удаление пробелов с начала и конца строки
        // проверка на последовательность символов в начале и конце строки
        // замена символов
        // string01.startsWith();
        // "str".startsWith();
        // upperString.strip().startsWith()
        // trim U+0020
        if (upperString.strip().startsWith("JA") && lowerString.trim().endsWith("er")) {
            System.out.println(upperString.replace("A", "!") +
                    lowerString.repeat(2));
        }
        /*
        String str = null;
        if (str != null) {
            System.out.println(str.toLowerCase());
        }
        */
        // массивы из строк
        string01 = "java junior developer";
        String[] strings = string01.split(" ");
        System.out.println(Arrays.toString(strings));

        char[] chars = string01.toCharArray();
        System.out.println(Arrays.toString(chars));

        // длина строки
        System.out.println(string01.length());

        // конкатенаци€ строк
        string01 = "Hello";
        string02 = "World";
        // оператор +
        String concat = string01 + " " + string02;
        concat = "Hello" + " " + "World";
        // метод concat
        concat = string01.concat(" ").concat(string02);

        // StringBuilder или StringBuffer (использовать дл€ конкатенации в цикле)
        StringBuilder sb = new StringBuilder();
        sb.append(string01).append(" ").append(string02).append("!!!");
        concat = sb.toString();
        System.out.println(concat);

        String reversed = sb.reverse()
                .delete(0, 3)
                .insert(1, "???")
                .toString();
        System.out.println(reversed);

        String[][] matrix01 = new String[3][3];
        String[][] matrix02 = {
                {"open", "close", "process"},
                {"close", "close", "process"},
                {"process", "close", "close"}
        };

        String[][] animals = new String[3][]; // [null, null, null]
        animals[0] = new String[2]; // [[null, null], null, null]
        animals[1] = new String[3]; // [[null, null], [null, null, null], null]
        animals[2] = new String[4]; // [[null, null], [null, null, null], [null, null, null, null]]

        // форматирование строк
        String item = " нига";
        int count = 0;
        double rating = 5.5;
        String formattedString =
        MessageFormat.format("“овар: {0}. Ќа складе: {1}шт. –ейтинг: {2}.",
                item, count, rating);
        System.out.println(formattedString);

        MessageFormat messageFormat = new MessageFormat("“: {0}.  ол: {1, choice, 0#товар отсутствует|0<мало|5<много}. –: {2}.", Locale.UK);
        formattedString = messageFormat.format(new Object[]{item, count, rating});
        System.out.println(formattedString);

        // class MessageFormat
        // {index}
        // {index, type}
        // {index, type, style}
        // number:	integer, currency, percent, custom format - class DecimalFormat
        // date:	short, medium, long, full, custom format - class SimpleDateFormat
        // time:	short, medium, long, full, custom format - class SimpleDateFormat
        // choice:	custom format - class ChoiceFormat

        int number = 1;
        boolean answer = true;
        double value = 5.77233;
        formattedString = String.format("%d) ¬ерный ответ: %B", number, answer);
        System.out.println(formattedString);

        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);

        formattedString = formatter.format("%d) ¬ерный ответ: %B", number, answer).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = formatter.format("%1$d) ¬ерный ответ: %2$b", number, answer).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = String.format("%d) ¬ерный ответ: %B", number, answer);
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = formatter.format("%1$d) ¬ерный ответ: %2$.1f", number, value).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);
        // %[argument_index$][flags][width][.precision]conversion
        // % и conversion €вл€ютс€ об€зательными
        // conversion указывает на то, как должен быть отформатирован аргумент.
        // b или B Ц дл€ логических значений
        // s или S Ч дл€ строк (String)
        // c или C - дл€ символов
        // d - дл€ дес€тичного числа
        // o - дл€ восьмеричного числа
        // x или X - дл€ шестнадцатеричного числа
        // f - дл€ чисел с плавающей точкой
        // t или T - дата и врем€
        // argument_index$ - целое число, аргумент из списка
        // flags - набор символов, используемых дл€ изменени€ формата вывода.
        // width Ч положительное целое число, минимальное количество символов, которое должно быть записано в вывод.
        // precision - целое число, используетс€ дл€ ограничени€ количества символов.
        //  оличество цифр после зап€той дл€ float и double

    }
}
