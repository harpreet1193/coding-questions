package com.example.codingquestions.linkedList;

import static com.example.codingquestions.linkedList.ListNode.printLinkedList;

public class RemoveNthFromEnd {

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
        ListNode head2 = removeNthFromEnd(head, 3);
        printLinkedList(head2);

    }

    private static ListNode removeNthFromEnd(ListNode head, int n){

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        int count = 0;
        while (fastPtr!=null){
            if (count>n)
                slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
            count++;
        }

        if (count == 1)
            return null;
        if (count == n)
            return head.next;
        slowPtr.next = slowPtr.next.next;
        return head;
    }
}
