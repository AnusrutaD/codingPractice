package com.coding.array;

public class Solution {


    // Rain water trap problem
    public int trap(int[] height) {
        int size = height.length;
        int[] leftMax = new int[size];
        leftMax[0] = height[0];
        for(int i = 1; i < size; i++){
            leftMax[i] = Math.max(leftMax[i -1], height[i]);
        }
        int[] rightMax = new int[size];
        rightMax[size -1] = height[size - 1];
        for(int i = size - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // System.out.println(Arrays.toString(leftIdx));
        // System.out.println(Arrays.toString(rightIdx));
        int ans = 0;
        for(int i = 1; i < height.length - 1; i++){
            ans += (Math.min(rightMax[i], leftMax[i]) - height[i]);
        }
        return ans;
    }
}
