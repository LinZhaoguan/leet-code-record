package com.puboot.$445;


import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stackL1 = new Stack<>();
        Stack<Integer> stackL2 = new Stack<>();
        Stack<Integer> result = new Stack<>();

        boolean plus = false;
        while (l1 != null) {
            stackL1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stackL2.push(l2.val);
            l2 = l2.next;
        }
        while (!stackL1.empty() || !stackL2.empty()) {
            int a = stackL1.empty() ? 0 : stackL1.pop();
            int b = stackL2.empty() ? 0 : stackL2.pop();
            int sum = plus ? a + b + 1 : a + b;
            plus = sum >= 10;
            sum %= 10;
            result.push(sum);
        }
        ListNode res = new ListNode(0);
        ListNode pre = res;
        while (!result.empty()) {
            pre.next = new ListNode(result.pop());
            pre = pre.next;
        }
        if (plus) {
            ListNode temp = res.next;
            res.next = new ListNode(1);
            res.next.next = temp;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(4);
        ListNode node33 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node33;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        System.out.println(new Solution().addTwoNumbers(node1, node4));
    }
}