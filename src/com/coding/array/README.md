# Array

## Class : Array - 1 

### [1. Maximum Subarray Sum](https://leetcode.com/problems/maximum-subarray/)

Use Kadane's  Algo (Carry Forward)

### 2. Beggars Outside Temple

- create an array will all the values are 0
- Traverse through the queries 
  - add `q[i][3]` to `input[q[i][0] - 1]` and substract `q[i][3]` from `input[q[i][1]]`

### 3.  Rain Water Trapped

Formula: ansArr[i] = MIN(leftMax, rightMax) - inputArr[i];

- leftMax = Max from 0<sup>th</sup> index to i<sup>th</sup> index
Calculate by Carry forward technique start from 0<sup>th</sup> index

- rightMax = Max from (i + 1)<sup>th</sup> index to (n-1)<sup>th</sup> index

res = sum of all the elements in ansArr

