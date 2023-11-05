package com.company.project.yandex.ru;
import java.util.Scanner;
public class Danya1 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int maxLength = Math.max(n - 1, m - 1);
            int count = 0;

            for (int hour = 0; hour < m; hour++) {
                if (reverseNumber(hour) < n) {
                    count++;
                }
            }

            if (count > Math.pow(10, 7)) {
                System.out.println(count % 1000000007);
            } else {
                System.out.println(count);
            }
        }

        public static int reverseNumber(int num) {
            int reversed = 0;
            while (num != 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }
            return reversed;
        }
    }

