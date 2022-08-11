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
}
