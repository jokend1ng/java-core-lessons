package com.company.project.yandex.ru;


import java.util.Scanner;

public class Danya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        long maxLength = Math.max(String.valueOf(n - 1).length(), String.valueOf(m - 1).length());
        long count = 0;

        for (long hour = 0; hour < n; hour++) {

            String hourString = String.format("%0" + maxLength + "d", hour);


            if (Long.valueOf(reverseString(hourString)) < m) {
                count++;
            }
        }

            System.out.println(count % 1000000007);

    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}