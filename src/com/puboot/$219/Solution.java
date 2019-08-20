package com.puboot.$219;

import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate_1(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
            list.add(i);
            map.put(nums[i], list);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            if (list.size() > 1) {
                Collections.sort(list);
                for (int i = 0; i < list.size() - 1; i++) {
                    if (Math.abs(list.get(i) - list.get(i + 1)) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate_2(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
            if (set.size() > k) {
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().containsNearbyDuplicate_2(new int[]{1,0,1,1}, 1));
    }
}