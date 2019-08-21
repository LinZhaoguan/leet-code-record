package com.puboot.$509;

class Solution {
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    private static int[] arr = new int[31];
    static {
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= 30; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }

    public int fib_1(int N) {
        return arr[N];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().fib_1(13));
    }
}