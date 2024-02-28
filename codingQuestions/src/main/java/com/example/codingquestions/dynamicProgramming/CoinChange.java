package com.example.codingquestions.dynamicProgramming;

public class CoinChange {

    public static void main (String []args){

        int [] coins =new int[]{1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
        coins = new int[]{2};
        amount = 3;
        System.out.println(coinChange(coins, amount));
        coins = new int[]{1};
        amount = 0;
        System.out.println(coinChange(coins, amount));
    }

    private static int coinChange(int [] coins, int amount){
        int [] minCoins = new int[amount + 1];
        minCoins[0] = 0;

        for (int i = 1; i<minCoins.length; i++)
            minCoins[i]= Integer.MAX_VALUE;

        for (int target = 1; target<=amount; target++){
            for (int coin : coins){
                if (target - coin >=0 && minCoins[target - coin]!=Integer.MAX_VALUE){
                    minCoins[target] = Math.min(minCoins[target - coin] +1 , minCoins[target]);
                }
            }
        }
        return minCoins[amount] == Integer.MAX_VALUE ? -1 : minCoins[amount];

    }
}


