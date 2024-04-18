package com.example.codingquestions.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

    static class Temp{
        int val;
        int idx;

        Temp(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

    }

    public static void main (String []args){

        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,40,50,60})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,60,90})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30})));
    }

    private static int[] dailyTemperatures(int [] temperatures){

        int n = temperatures.length;
        int []ans = new int[n];
        Stack<Temp> stk = new Stack<>();
        for (int i =0;i<n;i++){
            if (stk.isEmpty()){
                stk.push(new Temp(temperatures[i], i));
            } else {
                if (stk.peek().val < temperatures[i]){
                    while (!stk.isEmpty() && stk.peek().val < temperatures[i]){
                        Temp cur = stk.pop();
                        ans[cur.idx] = i - cur.idx;
                    }
                }
                stk.push(new Temp(temperatures[i], i));
            }
        }
        while (!stk.isEmpty()){
            Temp cur = stk.pop();
            ans[cur.idx] = 0;
        }
        return ans;
    }
}
