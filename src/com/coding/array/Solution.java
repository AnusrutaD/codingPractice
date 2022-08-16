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

        for(int i = 0; i < size - 1; i++){
            rightMax.add(0);
        }
        rightMax.add(height.get(size - 1));
        for(int i = size - 2; i >= 0; i--){
//            System.out.println(rightMax.size());
//            System.out.println(size - i - 2);
            rightMax.set(i, Math.max(rightMax.get(i + 1), height.get(i)));
        }
        // System.out.println(Arrays.toString(leftIdx));
        // System.out.println(Arrays.toString(rightIdx));
        int ans = 0;
        for(int i = 1; i < size - 1; i++){
            ans += (Math.min(rightMax.get(i), leftMax.get(i)) - height.get(i));
        }
        return ans;
    }


    // Array - 3
    // 1. Maximum Absolute Defferencre
    public int maxArr(ArrayList<Integer> A) {
        int Xmax = Integer.MIN_VALUE;
        int Xmin = Integer.MAX_VALUE;
        int Ymax = Integer.MIN_VALUE;
        int Ymin = Integer.MAX_VALUE;
        for(int i = 0; i < A.size(); i++){
            Xmax = Math.max(Xmax, A.get(i) + i);
            Xmin = Math.min(Xmin, A.get(i) + i);
            Ymax = Math.max(Ymax, A.get(i) - i);
            Ymin = Math.min(Ymin, A.get(i) - i);
        }
        return Math.max((Xmax - Xmin), (Ymax - Ymin));
    }
}
