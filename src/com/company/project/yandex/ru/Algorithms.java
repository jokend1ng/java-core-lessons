package com.company.project.yandex.ru;

import java.util.*;

public class Algorithms {

    public static void main(String[] args) {
       int[]  arr ={1,2,3};
        System.out.println( minMoves2(arr));
    }

        public static int minMoves2(int[] nums) {
            Arrays.sort(nums);
            int ans = 0, median = nums[nums.length / 2];
            for (int num : nums) ans += Math.abs(median - num);
            return ans;
        }

}


