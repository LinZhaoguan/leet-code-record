package com.puboot.$217;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().containsDuplicate(new int[]{1, 2, 3, 4, 1}));
    }
}