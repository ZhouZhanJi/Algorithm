package com.kira.linkedlist.utils;

public class ComUtils {

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

    public static void list(ListNode current){
        while (current != null) {   // 当前节点非空时继续
            System.out.println(current.val); // 操作节点值（如打印）
            current = current.next; // 指针后移
        }
    }

}
