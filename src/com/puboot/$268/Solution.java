package com.puboot.$268;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int missingNumber_1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, num);
        }
        while (n < nums.length) {
            if (map.get(n) == null) {
                return n;
            }
            n++;
        }
        return n;
    }

    public int missingNumber_2(int[] nums) {
        int n = nums.length;
        int a = n * (n + 1) / 2;
        int b = 0;
        for (int num : nums) {
            b += num;
        }
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber_2(new int[]{0,1,2,4,5}));
    }
}