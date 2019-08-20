package com.puboot.$220;

import java.util.*;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Long higher = set.higher(Long.valueOf(num) - 1);
            Long lower = set.lower(Long.valueOf(num) + 1);
            if (higher != null && higher - num <= t || lower != null && num - lower <= t) {
                return true;
            }
            set.add(Long.valueOf(num));
            if (set.size() > k) {
                set.remove(Long.valueOf(nums[i-k]));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
    }
}