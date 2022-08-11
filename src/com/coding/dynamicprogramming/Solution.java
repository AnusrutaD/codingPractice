package com.coding.dynamicprogramming;

public class Solution {

    // 198. House Robber problem
    public int rob(int[] arr){
        int size = arr.length;
//        int dp[] = new int[size];
        int first = arr[0];
        int second = Math.max(first, arr[1]);
        for(int i = 2; i < size; i++){
            int temp = Math.max(second, first + arr[i]);
            first = second;
            second = temp;
        }
        return second;
    }

    // 300. Longest Increasing Subsequence
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            dp[i] = 1;
            for(int j = i - 1; j >= 0; j--){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
