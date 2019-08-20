package com.puboot.$448;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findDisappearedNumbers_1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, num);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < nums.length + 1; i++) {
            if (!map.containsKey(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public List<Integer> findDisappearedNumbers_2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = - Math.abs(nums[index]);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findDisappearedNumbers_2(new int[]{1, 3, 1}));
    }
}