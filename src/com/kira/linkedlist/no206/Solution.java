package com.kira.linkedlist.no206;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static ListNode batchCreate(int... vals) {
        ListNode head = null, tail = null;
        for (int val : vals) {
            ListNode node = new ListNode(val);
            if (head == null) {
                head = node; // 初始化头尾指针
                tail = node;
            } else {
                tail.next = node; // 尾节点指向新节点
                tail = tail.next; // 更新尾指针
            }
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = batchCreate(1,2,3,4,5);
        Solution s = new Solution();
        ListNode newHead = s.reverseList(head);
        ListNode current = newHead;   // 从头节点开始
        while (current != null) {   // 当前节点非空时继续
            System.out.println(current.val); // 操作节点值（如打印）
            current = current.next; // 指针后移
        }
                
    }
}




