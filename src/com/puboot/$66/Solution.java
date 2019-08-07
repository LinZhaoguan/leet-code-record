package com.puboot.$66;

import java.util.Arrays;

class Solution {
    public int[] plusOne_1(int[] digits) {
        int len = digits.length;
        int plus = 0;
        for (int i = len - 1; i >= 0; i--) {
            int digit = digits[i];
            int r = digit + plus + (i == len - 1 ? 1 : 0);
            plus = 0;
            if (r < 10) {
                digits[i] = r;
                break;
            } else {
                digits[i] = r - 10;
                plus = r / 10;
            }
        }
        if (plus != 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = plus;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i - 1];
            }
            digits = newDigits;
        }
        return digits;
    }

    public int[] plusOne_2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = ++digits[i] % 10;
            if (digits[i] % 10 != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne_2(new int[]{9, 9, 9})));
    }
}