package com.greedy.array.level04.advanced;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 45 + 1);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}