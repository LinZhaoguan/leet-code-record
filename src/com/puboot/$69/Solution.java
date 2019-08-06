package com.puboot.$69;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long left = 0, right = x;
        while (left < right) {
            long middle = (left + right + 1) >>> 1;
            if (middle * middle > x) {
                right = middle - 1;
            }else {
                left = middle;
            }
        }
        return (int) left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147395599));
    }
}