package lesson03;

public class RelationalAndLogicalOperators {
    public static void main(String[] args) {
        // I. ќператоры сравнени€ (всегда возвращают результат типа boolean)
        // > больше
        // < меньше
        // >= больше или равно
        // <= меньше или равно
        // == равно
        // != не равно

        int apples = 24, pears = 31, bananas = 24;
        boolean result = apples < pears; // true, значение apples (24) меньше значени€ pears (31)
        result = apples != bananas; // false, значение apples (24) равно значению bananas (24)
        result = apples == bananas; // true, значение apples (24) равно значению bananas (24)
        result = apples >= bananas; // true, значение apples (24) равно значению bananas (24)
        result = apples <= pears; // true, значение apples (24) меньше значению pears (24)

        // I. логические операторы (всегда возвращают результат типа boolean)
        // && и - вернет true, если оба операнда - true.
        // ¬озвращает false и не провер€ет второй операнд,
        // если первый равен false
        // || или - вернет true, если один операнд - true.
        // ¬озвращает true и не провер€ет второй операнд,
        // если первый равен true
        // ! не - мен€ет значение операнда на противоположное
        int x = 7, y = 5;
        result = (x > 0) && (y > 0); // (7 > 0) && (5 > 0) --> true && true --> true
        result = (x < 0) && (y > 0); // (7 < 0) && (5 > 0) --> false && true --> false

        result = (x < 0) || (y < 0); // (7 < 0) || (5 < 0) --> false || false --> false --> false
        result = (x > 0) || (x > y); // (7 > 0) || (7 > 5) --> true || true --> true --> true

        // (5 <= x <= 15) ошибка синтаксиса
        // (x <= 5 && x >= 15) логическа€ ошибка
        // (x >= 5 && x <= 15) верно

        boolean isActive = true;
        result = !isActive; // !true --> false
        result = !(x < 0); // !(7 < 0) --> !false --> true

        // TODO #1
        int height = 10, width = 8;
        boolean created = true, colored = false;
        int code = 4444;

        // true
        result = (height % 2 == 0) && (height % 2 == 0) && (width % 2 == 0);
        // true
        result = (code == 2222) || (code == 3333) || (code == 4444);
        // true
        result = !colored && (code == 4444);
        // true
        result = colored || created;
        // false
        result = colored && created;

        // I. тернарный оператор ?:
        int yearStart = 2023, yearEnd = 2025;
        int validity = yearEnd > yearStart ? yearEnd - yearStart : -1;
        // условие (yearEnd > yearStart) - true, поэтому
        // тернарный оператор вернет результат вычитани€ yearEnd - yearStart, то есть 2
        System.out.println(validity); // 2

        yearStart = 2037;
        yearEnd = 2030;
        validity = yearEnd > yearStart ? yearEnd - yearStart : -1;
        // условие (yearEnd > yearStart) - false, поэтому
        // тернарный оператор вернет -1
        System.out.println(validity);

        // TODO #2
        //  –ешите следующую задачу, использу€ тернарный оператор:
        //  ƒана переменна€ sum - сумма покупки,
        //  если сумма покупки выше 100_000, покупатель получит скидку 10%,
        //  в противном случае скидка не предусмотрена.
        //  ¬ывести сумму покупки с учетом скидки.

        var /*(int / double)*/ sum = 800_000.0;
        var /*(double)*/ resultSum = sum > 100_000 ? sum * 0.9 : sum;
        sum = sum > 100_000 ? sum * .9 : sum;

    }
}
