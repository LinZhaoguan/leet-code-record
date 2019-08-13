package com.puboot.$121;

class Solution {
    public int maxProfit_1(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int p = prices[j] - prices[i];
                if (p > profit) {
                    profit = p;
                }
            }
        }
        return profit;
    }

    public int maxProfit_2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit_2(new int[]{10,2,9,1,2,1,3,1}));
    }
}