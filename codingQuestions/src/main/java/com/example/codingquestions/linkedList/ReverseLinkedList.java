package com.example.codingquestions.linkedList;

import static com.example.codingquestions.linkedList.ListNode.printLinkedList;

public class ReverseLinkedList {

    public static void main(String[]args){
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
        printLinkedList(head);
        printLinkedList(reverseList(head));


    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
