package com.puboot.$414;

import java.util.Comparator;
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        // 创建一个TreeSet的实例，元素由大到小排序。
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a);
            }
        });
        // 依次将数据nums中的元素添加进set
        for (int num : nums) {
            set.add(num);
            // 重点，如果set中的元素个数大于3，移除最后面的元素，也就是最小的元素。
            if (set.size() > 3) {
                set.remove(set.last());
            }
        }
        // set中的元素个数大于2就返回第三大的元素(set中的最后一个元素)，否则返回最大元素(set中的第一个元素)。
        return set.size() > 2 ? set.last() : set.first();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().thirdMax(new int[]{2,2,3,1}));
    }
}