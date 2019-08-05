package com.puboot.$27;

class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(solution.removeElement(nums, 2));
    }
}