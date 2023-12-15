package com.example.codingquestions.dynamicProgramming;

public class BestTimeToBuySellStocks {

    public static void main (String []args){

        int [] prices =new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int []prices){
        int leastSoFar = Integer.MAX_VALUE;
        int profitSoFar = 0;
        int profitCur;
        for (int price : prices) {
            if (price < leastSoFar) {
                leastSoFar = price;
            }
            profitCur = price - leastSoFar;
            if (profitSoFar < profitCur) {
                profitSoFar = profitCur;
            }
        }
        return profitSoFar;
    }
}
