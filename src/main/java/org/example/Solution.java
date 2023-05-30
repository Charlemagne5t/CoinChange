package org.example;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

      int result = dfs(coins, amount, 0);
      return result == Integer.MAX_VALUE ? -1 : result;
    }
    private int dfs(int[] coins, int amount, int count){
        if(amount < coins[0] && amount < 0) return Integer.MAX_VALUE;
        if(amount == 0) return count;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
           result = Math.min(result, dfs(coins, amount - coins[i], count + 1));
        }
        return result;
    }
}