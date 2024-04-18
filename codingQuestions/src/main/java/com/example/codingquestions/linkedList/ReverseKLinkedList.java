package com.example.codingquestions.linkedList;

import static com.example.codingquestions.linkedList.ListNode.printLinkedList;

public class ReverseKLinkedList {

    public static void main (String []args){
        ListNode head = new ListNode(1);
        ListNode cur = new ListNode(2);
        ListNode temp = head;
        temp.next = cur;
        temp = temp.next;
        cur = new ListNode(3);
        temp.next = cur;
        temp = temp.next;
        cur = new ListNode(4);
        temp.next = cur;
        temp = temp.next;
        cur = new ListNode(5);
        temp.next = cur;
//        temp = temp.next;

        printLinkedList(reverseKList(head, 10));
    }

    private static ListNode reverseKList(ListNode head, int k){

        ListNode prevHead = null;
        ListNode cur = head;
        ListNode end = cur;
        ListNode prevEnd = cur;
        while (cur!=null){
            int count = 1;
            while (count <=k && end!=null){
                count ++;
                prevEnd = end;
                end = end.next;
            }
            if (count <= k) break;
            prevEnd.next = null;
            if (prevHead!=null) prevHead.next = null;

            ListNode tempHead = reverseList(cur);
            if (prevHead == null) {
                prevHead = tempHead;
                head = prevHead;
            }
            else prevHead.next = tempHead;
            cur.next = end;
            prevHead = cur;
            cur = end;
        }
        return head;
    }

    private static ListNode reverseList (ListNode head){
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
