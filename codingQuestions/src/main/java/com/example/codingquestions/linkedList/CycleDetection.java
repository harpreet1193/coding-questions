package com.example.codingquestions.linkedList;

public class CycleDetection {

    public static void main (String []args){
        ListNode head = new ListNode(1);
        ListNode cur = new ListNode(2);
        ListNode temp = head;
        temp.next = cur;
        temp = temp.next;
        cur = new ListNode(3);
        temp.next = cur;
        temp = temp.next;
        cur = new ListNode(10);
        temp.next = cur;
        temp = temp.next;
        cur = new ListNode(5);
        temp.next = cur;
        temp = temp.next;
        cur = new ListNode(6);
        temp.next = cur;
//        cur.next = head;

        System.out.println(hasCycle(head));

    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr.next!=null && fastPtr.next.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr.equals(fastPtr)) return true;
        }
        return false;
    }
}
