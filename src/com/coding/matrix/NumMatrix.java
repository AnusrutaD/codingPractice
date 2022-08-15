package com.coding.matrix;


// 1. Sub-matrix Sum Queries
public class NumMatrix {
    int[][] preSum;
    public NumMatrix(int[][] matrix) {
        preSum = new int[matrix.length][matrix[0].length];
        preSum[0][0] = matrix[0][0];
        for(int j = 1; j < matrix[0].length; j++){
            preSum[0][j] = preSum[0][j -1] + matrix[0][j];
        }
        for(int i = 1; i < matrix.length; i++){
            preSum[i][0] = preSum[i - 1][0] + matrix[i][0];
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int upper = 0, left = 0, intersect = 0;
        if(row1 == 0 && col1 != 0){
            left = preSum[row2][col1 - 1];
        }
        if(row1 != 0 && col1 == 0){
            upper = preSum[row1 - 1][col2];
        }
        if(row1 != 0 && col1 != 0){
            upper = preSum[row1 - 1][col2];
            left = preSum[row2][col1 - 1];
            intersect = preSum[row1 - 1][col1 - 1];
        }
        int res = preSum[row2][col2] - (upper + left) + intersect;
        return res;
    }
}
