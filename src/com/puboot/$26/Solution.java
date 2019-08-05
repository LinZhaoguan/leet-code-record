package com.puboot.$26;


class Solution {
    public int removeDuplicates(int[] nums) {
        int a;
        int b;
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            a = nums[i + 1];
            b = nums[index];
            if (a != b) {
                index++;
                nums[index] = a;
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums));
    }
}