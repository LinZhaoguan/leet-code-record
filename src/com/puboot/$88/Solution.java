package com.puboot.$88;

import java.util.Arrays;

class Solution {
    public void merge_1(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        }
        int[] nums = new int[nums1.length];
        System.arraycopy(nums1, 0, nums, 0, nums.length);
        int front = 0, tail = 0;
        for (int i = 0; i < m + n; i++) {
            if (front == m || tail != n && nums[front] > nums2[tail]) {
                nums1[i] = nums2[tail];
                tail++;

            } else {
                nums1[i] = nums[front];
                front++;
            }
        }
    }

    public void merge_2(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int index = nums1.length - 1;
        while (index1 >= 0 && index2 >= 0) {
            nums1[index--] = nums1[index1] > nums2[index2] ? nums1[index1--] : nums2[index2--];
        }
        // 示例情况: nums1:[1,3,0,0,0]  num2:[0,1,2]
        System.arraycopy(nums2, 0, nums1, 0, index2 + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3,0,0,0};
        int[] nums2 = new int[]{0,1,2};
        Solution solution = new Solution();
        solution.merge_2(nums1, 2, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}