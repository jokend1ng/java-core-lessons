package lesson02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // арифметические операторы
        // + - * / %

        int x = 20, y = -1;
        // арифметический оператор - бинарный плюс
        int result = x + y; // 20 + -1 --> 19 --> result = 19

        // результатом сложения byte / short переменных будет тип int
        byte var01 = 89, var02 = 11;
        int byteResult01 = var01 + var02;
        // если нужно сохранить byte / short тип, результат выражения нужно явно привести в byte / short типу
        byte byteResult02 = (byte) (var01 + var02);

        // арифметический оператор - деление
        // результат целочисленного деления - целое число, остаток будет отброшен
        double bill = 503;
        double halfBill = bill / 2;
        System.out.println(halfBill);

        int number = 101, divisor = 10;
        // если нужно сохранить дробную часть, один из операндов нужно привести к числу с плавающей точкой
        double withoutLastDigit01 = (double) number / divisor;
        int withoutLastDigit02 = number / divisor;
        System.out.println(withoutLastDigit01);
        System.out.println(withoutLastDigit02);

        int n = 40;
        long m = 100L;
        long nmResult = n * m;
        System.out.println(nmResult);

        // Некоторые правила вычислений:
        // 1. результат арифметических вычислений с byte и short (+, ?, *, /, %) преобразуется в int
        // 2. если один из операндов long, результат выражения повышается до long
        // 3. но, если один из операндов float, результат выражения повышается до float
        // 4. но, если один из операндов double, результат выражения повышается до double

        // оператор % - остаток от деления
        number = 9;
        divisor = 2;
        int evenOrOddResult = number % divisor; // 1
        System.out.println(evenOrOddResult);

        number = 153;
        divisor = 10;
        int lastDigit = number % divisor; // 3
        System.out.println(lastDigit);

        // какой тип данных у переменной varResult и почему?
        var var1 = 60L;
        var var2 = -20;
        var var3 = 10.0;
        var varResult = var1 + var2 * var3;
        System.out.println(varResult); // double, тк один из операндов (var3) - double

        // операторы присваивания
        int num = 10;
        num = num + 10; // 10 + 10 --> 20 --> num = 20
        // num = num + 10 можно заменить на num += 10;
        // и так для всех арифметических операторов
        num -= 10; // или num = num - 10; // 20 - 10 --> 10 --> num = 10
        num *= 10; // или num = num * 10; // 10 * 10 --> 100 --> num = 100
        num /= 10; // или num = num / 10; // 100 / 10 --> 10 --> num = 10
        num %= 10; // или num = num % 10; // 10 % 10 --> num = 0

    }
}
