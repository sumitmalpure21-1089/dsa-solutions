package com.kavyuri.dsa.leetcode.easy;

import com.kavyuri.dsa.leetcode.medium.ListNode;

public class LinkedListCycle141 {

    // O(N) & O(1) - Floyd’s Cycle-Finding Algorithm
    public boolean hasCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }
}
