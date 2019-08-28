package com.puboot.$9;

class Solution {
    public boolean isPalindrome(int x) {
        return new StringBuilder().append(x).reverse().toString().equalsIgnoreCase(String.valueOf(x));
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(10));
    }
}