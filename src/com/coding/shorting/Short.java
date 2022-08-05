package com.coding.shorting;

import java.util.ArrayList;
import java.util.List;

public class Short {

    public List<Integer> mergeSort(List<Integer> arrayToSort){
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }
        int mid = arrayToSort.size() / 2;
        List<Integer> leftPart = new ArrayList<Integer>();
        List<Integer> rightPart = new ArrayList<Integer>();
        for(int i = 0; i < mid; i++){
            leftPart.add(arrayToSort.get(i));
        }
        for(int i = mid; i < arrayToSort.size(); i++){
            rightPart.add(arrayToSort.get(i));
        }
//        System.out.println(arrayToSort);
//        System.out.println(leftPart);
//        System.out.println(rightPart);
        leftPart = mergeSort(leftPart);
        rightPart = mergeSort(rightPart);
        return merge(leftPart, rightPart);
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
