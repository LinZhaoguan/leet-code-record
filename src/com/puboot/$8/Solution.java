package com.puboot.$8;

class Solution {
    public int myAtoi(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        str = str.trim();
        char first = str.charAt(0);
        boolean b = Character.isDigit(first) || first == '+' || first == '-';
        if (!b) {
            return 0;
        }
        boolean negative = false;
        if (first == '-') {
            negative = true;
        }
        long res = 0;
        for (int i = Character.isDigit(first) ? 0 : 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.digit(c, 10);
                if (negative) {
                    if (-(res * 10 + digit) < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                }else {
                    if (res * 10 + digit > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }
                res = res * 10 + digit;
                continue;
            }
            break;
        }
        return (int) (negative ? -res : res);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myAtoi("3.14159"));
        System.out.println(new Solution().myAtoi(".1"));
        System.out.println(new Solution().myAtoi("   -42"));
        System.out.println(new Solution().myAtoi("4193 with words"));
        System.out.println(new Solution().myAtoi("    +0a32"));
        System.out.println(new Solution().myAtoi("-91283472332"));
    }
}