package com.puboot.$169;

import java.util.HashMap;
import java.util.Map;

class Solution {
    // 哈希表法
    public int majorityElement_1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }else {
                map.put(num, 1);
            }
        }
        int max = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (maxValue < value) {
                max = key;
                maxValue = value;
            }
        }
        return max;
    }

    // 投票法
    public int majorityElement_2(int[] nums) {
        int max = -1;
        int sum = 0;
        for (int num : nums) {
            if (sum == 0) {
                max = num;
            }
            if (max == num) {
                sum += 1;
            }else {
                sum -= 1;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement_2(new int[]{6,5,5}));
    }
}