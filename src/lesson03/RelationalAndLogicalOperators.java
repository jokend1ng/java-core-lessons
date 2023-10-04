package lesson03;

public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        // I. Операторы сравнения (всегда возвращают результат типа boolean)
        // > больше
        // < меньше
        // >= больше или равно
        // <= меньше или равно
        // == равно
        // != не равно

        int apples = 24, pears = 31, bananas = 24;
        boolean result = apples < pears; // true, значение apples (24) меньше значения pears (31)
        result = apples != bananas; // false, значение apples (24) равно значению bananas (24)
        result = apples == bananas; // true, значение apples (24) равно значению bananas (24)
        result = apples >= bananas; // true, значение apples (24) равно значению bananas (24)
        result = apples <= pears; // true, значение apples (24) меньше значению pears (24)

        // I. логические операторы (всегда возвращают результат типа boolean)
        // && и - вернет true, если оба операнда - true. Возвращает false и не проверяет второй операнд,
        // если первый равен false
        // || или - вернет true, если один операнд - true. Возвращает true и не проверяет второй операнд,
        // если первый равен true
        // ! не - меняет значение операнда на противоположное
        int x = 7, y = 5;
        result = (x > 0) && (y > 0); // (7 > 0) && (5 > 0) --> true && true --> true
        result = (x < 0) && (y > 0); // (7 < 0) && (5 > 0) --> false && true --> false

        result = (x < 0) || (y < 0); // (7 < 0) || (5 < 0) --> false || false --> false --> false
        result = (x > 0) || (x > y); // (7 > 0) || (7 > 5) --> true || true --> true --> true


        boolean isActive = true;
        result = !isActive; // !true --> false
        result = !(x < 0); // !(7 < 0) --> !false --> true

        // TODO #1

        // I. тернарный оператор ?:
        int yearStart = 2023, yearEnd = 2025;
        int validity = yearEnd > yearStart ? yearEnd - yearStart : -1;
        // условие (yearEnd > yearStart) - true, поэтому
        // тернарный оператор вернет результат вычитания yearEnd - yearStart, то есть 2
        System.out.println(validity);

        yearStart = 2037;
        yearEnd = 2030;
        validity = yearEnd > yearStart ? yearEnd - yearStart : -1;
        // условие (yearEnd > yearStart) - false, поэтому
        // тернарный оператор вернет -1
        System.out.println(validity);

        // TODO #2

    }
}
