package com.puboot.$118;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>(numRows);
        if (numRows <= 0) {
            return res;
        }
        res.add(Collections.singletonList(1));
        for (int row = 1; row < numRows; row++) {
            List<Integer> rowList = new ArrayList<>();
            List<Integer> prewList = res.get(row - 1);
            rowList.add(1);
            for (int i = 1; i < row; i++) {
                rowList.add(prewList.get(i - 1) + prewList.get(i));
            }
            rowList.add(1);
            res.add(rowList);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(5).forEach(System.out::println);
    }
}