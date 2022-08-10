package com.coding.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String inputStr[] = br.readLine().split(" ");
        int nums[] = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = Integer.parseInt(inputStr[i]);
        }
        Solution solution = new Solution();
        int res = solution.rob(nums);
        System.out.println(res);
    }
}
