package com.puboot.$532;

import java.util.*;

class Solution {
    public int findPairs_1(int[] nums, int k) {

        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    if (!map.containsKey(nums[i] + nums[j])) {
                        map.put(nums[i] + nums[j], nums[i] + nums[j]);
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public int findPairs_2(int[] nums, int k) {
        if (nums==null || nums.length<2 || k < 0) {
            return 0;
        }
        Map<Integer, Integer> numsMap = new TreeMap<>();
        Set<Integer> sumSet = new TreeSet<>();
        int count = 0;
        for (int num : nums) {
            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
        }
        if (k == 0) {
            for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
                Integer itemCount = entry.getValue();
                if (itemCount > 1) {
                    count++;
                }
            }
            return count;
        }
        for (int num : nums) {
            if (numsMap.containsKey(num + k) && !sumSet.contains(num + k)) {
                count++;
                sumSet.add(num + k);
            }
        }
        return count;
    }

    /**
     *  责任的氛围不够浓，大家遇到问题、遇到困难、工作完不成就找理由、找借口，
     *  很少去分析自己个人在这件事上到底应该负有多大的责任，出现问题的原因是什么，有什么补救措施，今后应如何避免。
     *  只有以责任者的心态对待工作，我们的产品品质和人员素质才能得到切实地提升，所以公司的管理层不应该接受理由和借口，这样造成员工责任意识的淡薄。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Solution().findPairs_2(new int[]{1,1,1,1,1}, 0));
    }
}
