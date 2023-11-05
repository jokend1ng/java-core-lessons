package com.company.project.yandex.ru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] difficulties = new int[n];

        for (int i = 0; i < n; i++) {
            difficulties[i] = scanner.nextInt();
        }

        int left = 0;
        int right = n - 1;

        List<Integer> pairs = new ArrayList<>();
        while (left < right) {
            int sum = difficulties[left] + difficulties[right];


            if (pairs.size() > 0 && sum != pairs.get(0)) {
                System.out.println("-1");
                return;
            }

            pairs.add(sum);

            left++;
            right--;
        }


        if (n % 2 != 0) {
            pairs.add(difficulties[left]);
        }


        System.out.println(pairs.get(0));
    }



}