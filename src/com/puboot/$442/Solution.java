package com.puboot.$442;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(Math.abs(nums[i]));
            }else {
                nums[index] = - nums[index];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}