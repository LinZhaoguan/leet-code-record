package com.puboot.$6;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        int lp = 0;
        List<StringBuilder> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            lists.add(new StringBuilder());
        }
        boolean add = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int line = lp % numRows;
            lists.get(line).append(c);
            if (line == numRows - 1) {
                add = false;
            } else if (line == 0) {
                add = true;
            }
            if (add) {
                lp++;
            }else {
                lp--;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder stringBuilder : lists) {
            sb.append(stringBuilder);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new Solution().convert("LEETCODEISHIRING", 3);
        System.out.println(s);
    }
}