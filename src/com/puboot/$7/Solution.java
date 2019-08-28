package com.puboot.$7;

class Solution {
    public int reverse(int x) {
        try {
            int i = Integer.parseInt(new StringBuilder().append(Math.abs(x)).reverse().toString());
            return x > 0 ? i : -i;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(new Solution().reverse(Integer.MAX_VALUE));
    }
}