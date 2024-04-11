package com.example.codingquestions.linkedList;

public class CopyLinkedListWithRandomPointer {

    public static class RandomListNode{
        int val;
        RandomListNode next;
        RandomListNode random;

        RandomListNode() {}
        RandomListNode(int val) { this.val = val; }
        RandomListNode(int val, RandomListNode next, RandomListNode random) {
            this.val = val; this.next = next;
            this.random = random;
        }

        static void printLinkedList(RandomListNode head){
            while (head!=null){
                System.out.print(head.val + "->");
                head=head.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public static void main (String []args){
        RandomListNode head = new RandomListNode(1);
        RandomListNode cur2 = new RandomListNode(2);
        RandomListNode cur3 = new RandomListNode(3);
        RandomListNode cur4 = new RandomListNode(4);
        head.next = cur2;
        head.random = cur3;
        cur2.next = cur3;
        cur2.random = cur4;
        cur3.next = cur4;

        RandomListNode head2 = copy(head);
        System.out.println();

    }

    public static RandomListNode copy (RandomListNode head){
        if (head == null) return head;
        RandomListNode cur = head;

        while (cur != null){
            RandomListNode next = cur.next;
            cur.next = new RandomListNode(cur.val);
            cur.next.next = next;
            cur = next;
        }

        cur = head;

        while (cur!=null){
            if (cur.random!=null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        RandomListNode head2 = head.next;
        RandomListNode cur2 = head2;
        cur = head;
        while (cur2.next!=null){
            cur.next = cur.next.next;
            cur = cur.next;
            cur2.next = cur2.next.next;
            cur2 = cur2.next;
        }
        cur.next = cur.next.next;

        return head2;

    }
}
