package com.puboot.$35;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int left = 0;
        int right = length;
        while (left < right) {
            int middle = (left + right) >>> 1;
            if (nums[middle] < target) {
                left = middle + 1;
            }else {
                right = middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(nums, 4));
    }
}