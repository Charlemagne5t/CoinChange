package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//DP + memo
public class SolutionTopDown {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        Map<Integer, Integer> memo = new HashMap<>();
        int result = dfs(coins, amount, memo);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    private int dfs(int[] coins, int amount, Map<Integer, Integer> memo){
        if(memo.containsKey(amount)) return memo.get(amount);
        if(amount < coins[0] && amount < 0) return Integer.MAX_VALUE;
        if(amount == 0) return 0;
        int result = Integer.MAX_VALUE;
        for (int coin : coins) {
            int remaining = amount - coin;
            int subResult = dfs(coins, remaining, memo);
            if (subResult != Integer.MAX_VALUE)
                result = Math.min(result, subResult + 1);
        }
        memo.put(amount, result);
        return result;
    }
}