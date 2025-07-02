package com.kira.linkedlist.no19;

import com.kira.linkedlist.utils.ListNode;

import static com.kira.linkedlist.utils.ComUtils.batchCreate;
import static com.kira.linkedlist.utils.ComUtils.list;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(-1);
        d.next = head;
        ListNode x = findToEnd(d, n+1);
        x.next = x.next.next;
        return head;
    }

    ListNode findToEnd(ListNode head, int n){
        ListNode l1 = head;
        for(int i = 0; i < n; i++){
            l1 = l1.next;
        }
        ListNode l2 = head;
        while(l1 != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        return l2;
    }

    public static void main(String[] args) {
        ListNode head = batchCreate(1,2,3,4,5);
        Solution s = new Solution();
        ListNode node = s.removeNthFromEnd(head, 3);
        list(node);
    }
}
