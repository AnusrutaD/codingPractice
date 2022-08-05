package com.coding.shorting;

import com.coding.input.Input;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Short obj = new Short();
        Input input = new Input();
        List<Integer> arrayToSort = input.takeIntArr();
        arrayToSort = obj.mergeSort(arrayToSort);
        System.out.println(arrayToSort);
    }
}
