package com.example.codingquestions.misc;

/*
Given the heads of two singly linked-lists headA and headB,
return the node at which the two lists intersect.
If the two linked lists have no intersection at all, return null.
 */

public class NodeIntersection {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        ListNode newNode;
        ListNode head1 = new ListNode(10);
        ListNode head2 = new ListNode(3);
        newNode = new ListNode(6);
        head2.next = newNode;
        newNode = new ListNode(9);
        head2.next.next = newNode;
        newNode = new ListNode(15);
        head2.next.next.next = newNode;
        newNode = new ListNode(15);
        head1.next = newNode;
        newNode = new ListNode(30);
        head1.next.next = newNode;
        head1.next.next.next = null;
        ListNode intersect_node = getIntersectionNode(head1, head2);
        if (intersect_node!=null)
            System.out.println("intersecting node : " + intersect_node.val);
        else
            System.out.println("No intersecting node ");

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        if (ptr1 == null || ptr2 == null) {
            return null;
        }
        while (ptr1!=ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            if (ptr1 == ptr2) {
                return ptr1;
            }
            if(ptr1== null) {
                ptr1 = headB;
            }
            if (ptr2==null) {
                ptr2 = headA;
            }
        }
        return ptr1;
    }


}
