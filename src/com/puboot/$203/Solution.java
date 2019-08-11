package com.puboot.$203;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dynamicHead = new ListNode(-1);
        dynamicHead.next = head;
        ListNode prev = dynamicHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return dynamicHead.next;
    }
}
