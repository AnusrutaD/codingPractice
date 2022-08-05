package com.coding.shorting;

import java.util.ArrayList;
import java.util.List;

public class Short {

    public void mergeSort(List<Integer> arrayToSort){
        if(arrayToSort.size() <= 1){
            return;
        }
        int start = 0, end  = arrayToSort.size() - 1;
        int mid = start + (end - start) / 2;
        List<Integer> leftPart = new ArrayList<Integer>();
        List<Integer> rightPart = new ArrayList<Integer>();
        for(int i = start; i <= mid; i++){
            leftPart.add(arrayToSort.get(i));
        }
        for(int i = mid + 1; i <= end; i++){
            rightPart.add(arrayToSort.get(i));
        }
        mergeSort(leftPart);
        mergeSort(rightPart);
        arrayToSort = merge(leftPart, rightPart);
    }

//    This is the Method to merge to unsorted array and return the sorted Array
    public List<Integer> merge(List<Integer> leftPart, List<Integer> rightPart){
        List<Integer> answare = new ArrayList<>();
        int leftIndex = 0, rightIndex = 0;
        while(leftIndex < leftPart.size() && rightIndex < rightPart.size()){
            if(leftPart.get(leftIndex) < rightPart.get(rightIndex)){
                answare.add(leftPart.get(leftIndex));
                leftIndex++;
            }
            else {
                answare.add(rightPart.get(rightIndex));
                rightIndex++;
            }
        }
        while (leftIndex < leftPart.size()){
            answare.add(leftPart.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex < rightPart.size()){
            answare.add(rightPart.get(rightIndex));
            rightIndex++;
        }
        return answare;
    }
}
