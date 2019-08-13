package com.puboot.$167;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int frontIndex = 0, tailIndex = numbers.length - 1;
        while (numbers[frontIndex] + numbers[tailIndex] != target) {
            int sum = numbers[frontIndex] + numbers[tailIndex];
            if (sum > target) {
                tailIndex--;
            } else if (sum < target) {
                frontIndex++;
            }
        }
        return new int[]{frontIndex + 1, tailIndex + 1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}