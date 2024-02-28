package com.example.codingquestions.linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLinkedList {

    public static void main (String []args) {

    }

    private static ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new ListNodeComparator());
        for (ListNode curHead : lists) {
            ListNode temp = curHead;
            while (temp!=null){
                pq.add(temp);
                temp = temp.next;
            }
        }

        ListNode head = null;
        ListNode cur = null;
        ListNode prev = null;

        while (!pq.isEmpty()){

            ListNode temp = pq.poll();
            if (head == null){
                head = new ListNode(temp.val);
                head.next = cur;
                prev = head;
            } else {
                cur = new ListNode(temp.val);
                prev.next = cur;
                cur.next = null;
                prev = cur;
            }
        }

        return head;
    }
}

class ListNodeComparator implements Comparator<ListNode> {

    @Override
    public int compare(ListNode a, ListNode b){
        if (a.val < b.val){
            return 1;
        } else if (a.val > b.val)
            return -1;
        return 0;
    }
}
