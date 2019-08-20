package com.puboot.$283;

import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNotZeroAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNotZeroAt++] = nums[i];
            }
        }
        for (int i = lastNotZeroAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}