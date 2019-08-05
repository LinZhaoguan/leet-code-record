package com.puboot.$1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum_1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum_2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer complement = map.get(target - nums[i]);
            if (complement != null && complement != i) {
                return new int[]{i, complement};
            }
        }
        return null;
    }

    public int[] twoSum_3(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer index = map.get(complement);
            if (index != null && index != i) {
                return new int[]{index, i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum_3(nums, 9)));
    }
}