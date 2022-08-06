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

//    378. Kth Smallest Element in a Sorted Matrix (Leetcode question)
    public int kthSmallest(List<List<Integer>> mat, int k){
        int row = mat.size();
        int col = mat.get(0).size();

        // Range will be between maximum and minimum element
        int min = mat.get(0).get(0);
        int max = mat.get(row - 1).get(col - 1);

        while (min < max){
            int mid = min + (max - min) / 2;
            // Find the no of elements is lesser than equals to mid
            int count = 0;

            int i = col - 1, j = 0;
            // Checking start from first element of last row ]
            // if the element is grater than skip the row and check previous row
            while (i >= 0  && j < col){
                if(mat.get(i).get(j) <= mid){
                    count += i + 1;
                    j++;
                }
                else{
                    i--;
                }
            }
            if(count < k){
                min = mid + 1;
            }
            else {
                max = mid;
            }
        }
        return (min >= mat.get(0).get(0) && min <= mat.get(row - 1).get(col - 1)) ? min : -1;
    }
}
