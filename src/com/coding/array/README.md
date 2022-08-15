# Array

## Class : Array - 1 

### 1. Maximum Subarray Sum

### 2. Beggars Outside Temple

### 3.  Rain Water Trapped

Formula: ansArr[i] = MIN(leftMax, rightMax) - input[i];

- leftMax = Max from 0 <sup>th</sup> index to i <sup>th</sup> index
- rightMax = Max from (i + 1) <sup>th</sup> index to (n-1) <sup>th</sup> index
