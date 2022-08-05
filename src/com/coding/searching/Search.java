package com.coding.searching;

import java.util.List;

public class Search {

    public boolean binarySearch(List<Integer> arr, int ele){
        int low = 0, high = arr.size();
        while (low <= high){
            int mid = low + (high - low) / 2;
            if(ele == mid){
                return true;
            }
            if(ele < mid){
                high = mid - 1;
            }
            else{
               low = mid + 1;
            }
        }
        return false;
    }
}
