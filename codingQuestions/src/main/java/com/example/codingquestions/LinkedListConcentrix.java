package com.example.codingquestions;

import java.util.Scanner;

public class LinkedListConcentrix {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class MyLinkedList {
        private ListNode head;

        public MyLinkedList() {
            head = null;
        }

        public void add(int val) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
            } else {
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void remove(int val) {
            if (head == null) {
                return;
            }
            if (head.val == val) {
                head = head.next;
                return;
            }
            ListNode prev = null;
            ListNode current = head;
            while (current != null && current.val != val) {
                prev = current;
                current = current.next;
            }
            if (current == null) {
                return;
            }
            prev.next = current.next;
        }

        public void traverse() {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
        public void reverse() {
            ListNode prev = null;
            ListNode current = head;
            ListNode nextNode;

            while (current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            head = prev;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        MyLinkedList list = new MyLinkedList();

        for (int i = 0; i < N; i++) {
            String operation = scanner.next();
            if (operation.equals("add")) {
                int val = scanner.nextInt();
                list.add(val);
            } else if (operation.equals("remove")) {
                int val = scanner.nextInt();
                list.remove(val);
            } else if (operation.equals("traverse")) {
                list.traverse();
            } else if (operation.equals("reverse")) {
                list.reverse();
            }
        }
    }
}