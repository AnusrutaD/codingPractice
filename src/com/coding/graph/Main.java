package com.coding.graph;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[][] circles = new int[size][3];
        for (int i = 0; i < size; i++){
            for(int j = 0; j < 3; j++){
                circles[i][j] = input.nextInt();
            }
        }
        System.out.println(solution.checkCircleInSameGroup(circles));
    }
}

// [[1,2,3],[2,3,1],[3,4,2],[4,5,3],[5,6,4]]

//1 2 3 2 3 1 3 4 2 4 5 3 5 6 4