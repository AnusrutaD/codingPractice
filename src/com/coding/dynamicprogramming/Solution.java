package com.coding.dynamicprogramming;

public class Solution {

    // 198. House Robber problem
    public int rob(int[] arr){
        int size = arr.length;
        int dp[] = new int[size];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for(int i = 2; i < size; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]) ;
        }
        return dp[size - 1];
    }
}
