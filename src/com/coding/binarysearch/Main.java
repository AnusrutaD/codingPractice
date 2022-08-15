package com.coding.binarysearch;

import com.coding.input.Input;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        Input input = new Input();
        List<List<Integer>> mat = input.takeIntMatrix();
        int k = input.takeInt();
        System.out.println(search.kthSmallest(mat, k));

    }
}
