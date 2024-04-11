package com.example.codingquestions.misc;

import java.util.Stack;

public class MinStack {

    static class StackElem{
        int val;
        int minVal;
        StackElem next;

        StackElem(int val, int minVal, StackElem next){
            this.val = val;
            this.minVal = minVal;
            this.next = next;
        }
    }

    private StackElem head;

    public MinStack() {
        head = null;
    }

    public void push (int val) {
        if (head == null){
            head = new StackElem(val, val, null);
        } else {
            head = new StackElem(val, Math.min(val, head.minVal), head);
        }
    }

    public int top () {
        return head.val;
    }

    public void pop() {
        head = head.next;
    }

    public int getMin() {
        return head.minVal;
    }

    public static void main (String []args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
