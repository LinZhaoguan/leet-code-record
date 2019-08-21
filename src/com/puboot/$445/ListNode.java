package com.puboot.$445;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            if (node.next != null) {
                sb.append(node.val).append(" -> ");
            }else {
                sb.append(node.val);
            }
            node = node.next;
        }
        return sb.toString();
    }
}