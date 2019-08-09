package com.puboot.$119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> getRow_1(int rowIndex) {
        List<Integer> tempRow = new ArrayList<>();
        tempRow.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(tempRow.get(j - 1) + tempRow.get(j));
            }
            row.add(1);
            tempRow = row;
        }
        return tempRow;
    }

    public List<Integer> getRow_2(int rowIndex) {
        Integer[] tempRow = new Integer[rowIndex + 1];
        Arrays.fill(tempRow, 1);
        for (int i = 2; i < tempRow.length; i++) {
            for (int j = i - 1; j > 0; j--) {
                tempRow[j] += tempRow[j - 1];
            }
        }
        return Arrays.asList(tempRow);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow_2(4));
    }
}