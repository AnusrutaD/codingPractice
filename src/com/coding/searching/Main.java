package com.coding.searching;

import com.coding.input.Input;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        Input input = new Input();
        List<Integer> arr = input.takeIntArr();
        int ele = input.takeInt();
        System.out.println(search.binarySearch(arr, ele));
    }
}
