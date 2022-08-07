package com.coding.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {


    // Rain water trap problem
    public int trap(List<Integer> height) {
        int size = height.size();
        List<Integer> leftMax = new ArrayList<>();
        leftMax.add(height.get(0));
        for(int i = 1; i < size; i++){
            leftMax.add(Math.max(leftMax.get(i -1), height.get(i)));
        }
        List<Integer> rightMax = new ArrayList<>();
        rightMax.add(height.get(size - 1));
        for(int i = size - 2; i >= 0; i--){
            rightMax.get(Math.max(rightMax.get(i - 1), height.get(i)));
        }
        Collections.reverse(rightMax);
        // System.out.println(Arrays.toString(leftIdx));
        // System.out.println(Arrays.toString(rightIdx));
        int ans = 0;
        for(int i = 1; i < size - 1; i++){
            ans += (Math.min(rightMax.get(i), leftMax.get(i)) - height.get(i));
        }
        return ans;
    }
}
