package com.puboot.$189;

import java.util.Arrays;

class Solution {
    public void rotate_1(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = (i + k) % nums.length;
            newNums[index] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newNums[i];
        }
    }

    public void rotate_2(int[] nums, int k) {
        if (nums.length <= 1) {
            return;
        }
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 1, 2};
        new Solution().rotate_2(nums, 5);
        System.out.println(Arrays.toString(nums));
    }
}