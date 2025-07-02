package com.kira.linkedlist.no24;
import com.kira.linkedlist.utils.ListNode;

import static com.kira.linkedlist.utils.ComUtils.batchCreate;
import static com.kira.linkedlist.utils.ComUtils.list;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next== null){
            return head;
        }
        ListNode next = head.next;
        ListNode newNode = swapPairs(next.next);
        next.next = head;
        head.next = newNode;
        return next;
    }

    public static void main(String[] args) {
        ListNode head = batchCreate(1,2,3,4);
        Solution s = new Solution();
        ListNode node = s.swapPairs(head);
        list(node);
    }
}
